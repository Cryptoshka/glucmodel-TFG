package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.InfoBasicaPaciente;
import database.FuncionesBD;
import database.InfoLogin;

/**
 * Servlet implementation class InfoPaciente
 */
@WebServlet("/InfoPaciente")
public class InfoPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoPaciente() {
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
    	
    	// 1. Conectar a la BD
    	FuncionesBD.conectar();
    	
    	// 2. Obtener información básica de la ficha
    	String s = request.getParameter("id");
    	int id_paciente = Integer.parseInt(s);
    	System.out.println("El servlet ha recibido el id_paciente=" + id_paciente);
    	InfoBasicaPaciente ficha = FuncionesBD.dameInfoBasicaPaciente(id_paciente);
    	request.setAttribute("fichaPaciente", ficha);
    	System.out.println("Información de la ficha:");
    	System.out.println("Nombre: " + ficha.getNomApell());
    	System.out.println("Peso: " + ficha.getPeso());
    	System.out.println("Altura: " + ficha.getAltura());
    	// 3. Obtener pesos para la gráfica
    	
    	// 4. Obtener glucemias
    	
    	// 5. Obtener insulina
    	
    	// 6. Obtener ejercicio
    	
    	// 7. Obtener pruebas médicas
    	
    	// 8. Desconectar de la BD
    	FuncionesBD.desconectar();
    	
    	// 9. Redirigiar al .JSP
        request.getRequestDispatcher("m_ejemplo_manual.jsp").forward(request, response);
    }
    
	/** Handles the HTTP <code>GET</code> method.
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
