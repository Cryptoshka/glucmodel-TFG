package servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.FuncionesBD;
import database.InfoLogin;
import security.MD5;

/**
 * Servlet implementation class ProcesaLogin
 */
@WebServlet("/ProcesaLogin")
public class ProcesaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesaLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> method.
     * @param request servlet request
     * @param response servlet request
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Server at: " + request.getContextPath());
        out.println("Se ha llamado al servlet que procesa el login");
        
        /*System.out.println("El parametro email es: " + request.getParameter("email"));
        System.out.println("El parametro pwd es: " + request.getParameter("pwd"));*/
        
        InfoLogin info = new InfoLogin();
        checkLogin(request.getParameter("email"), request.getParameter("pwd"), info);
        
        if(info.isLoginCorrecto()) {
        	if (!info.isEsMedico()) {
                System.out.println("Login correcto para paciente");
                response.sendRedirect("/IndexPaciente");
        	} else {
                System.out.println("Login correcto para medico");
                request.setAttribute("InfoLogin", info);
                request.getRequestDispatcher("/IndexMedico").forward(request, response);
        	}
        } else {
        	System.out.println("Login incorrecto");
        }
    }
    
    /**
     * Dados el usuario y contraseña de login, comprueba si son válidos.
     * @param usr El usuario introducido en la IU web.
     * @param pwd La contraseña introducida en la IU web.
     * @return El ID de usuario si los parámetros son correctos. -1 e.o.c.
     */
    int checkLogin(String usr, String pwd, InfoLogin info) {    
    	int id = -1;
    	
        // Conectar a la BD
        FuncionesBD.conectar();
        
        // Comprobar que el usuario existe
        if(FuncionesBD.checkUserExists(usr, info)) {
        	System.out.println("El usuario " + usr + " existe.");
        	
        	// Comprobar si la contraseña es válida
        	String bd_usr_hash = FuncionesBD.getUsrPwd(usr);
           	String login_usr_hash = MD5.hash(pwd);
           	/*System.out.println("bd_usr_hash   : " + bd_usr_hash);
           	System.out.println("login_usr_hash: " + login_usr_hash);*/
           	
           	// DEVUELVO EL ID DEL medico1@gmail.com hasta que solucione el problema del hash.
           	id = 39;
           	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        } else {
        	System.out.println("El usuario " + usr + " NO existe.");
        }
        
        // Desconectar
        FuncionesBD.desconectar();
        
        return id;
    }
    
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet request
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet request
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
