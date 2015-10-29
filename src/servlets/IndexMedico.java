package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.DatoBD;
import beans.NombresPacientes;
import database.FuncionesBD;

/**
 * Servlet implementation class IndexMedico
 */
@WebServlet("/IndexMedico")
public class IndexMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexMedico() {
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
        // Conectar a la BD y obtener todos los datos necesarios para esta página .jsp (m_index_medico.jsp)
    	FuncionesBD.conectar();
    	
    	int id_doctor = 5; // Por ejemplo. En realidad, habrá que obtenerlo de la sesión.
    	
    	// Obtener información básica (id, etc.)
    	// ...
    	
    	// Obtener la lista de pacientes asociados a este médico
    	NombresPacientes n = FuncionesBD.dameNombrePacientes(id_doctor);
    	//NombresPacientes n = new NombresPacientes();
    	//n.setNombres(aux);
    	
    	// Bean de ejemplo
    	DatoBD dato = new DatoBD();
    	dato.setCadena("Este es el dato del bean");
    	
    	// Cerrar la conexión con la BD
    	FuncionesBD.desconectar();
    	
    	// Con los datos ya recopilados, mostrar el jsp.
    	request.setAttribute("datoBD", dato);
    	request.setAttribute("nombresPacientes", n);
    	request.getRequestDispatcher("m_index_medico.jsp").forward(request, response);        
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
