package webapp;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.FuncionesBD;

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
        
        System.out.println("El parametro email es: " + request.getParameter("email"));
        System.out.println("El parametro pwd es: " + request.getParameter("pwd"));
        
        int res = checkLogin(request.getParameter("email"), request.getParameter("pwd"));
        if (res == 0) {
            out.println("Login correcto para paciente");
        } else if (res == 1) {
            out.println("Login correcto para medico");
        } else {
            out.println("Login incorrecto");
        }
    }
    
    int checkLogin(String usr, String pwd) {
        
        // Conectar a la BD
        FuncionesBD.conectar();
        
        // Realizar Query con user y pwd
        System.out.println("checkLogin llama con " + usr);
        FuncionesBD.checkUserExists(usr);
        
        // Ver si es válida
        
        // Desconectar
        FuncionesBD.desconectar();
        
        return -1;
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
