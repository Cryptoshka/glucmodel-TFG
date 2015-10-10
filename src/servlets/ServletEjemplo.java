package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletEjemplo
 */
@WebServlet(urlPatterns = {"/ServletEjemplo", "/OtraURL"})
public class ServletEjemplo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEjemplo() {
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
        
    	// ESCRIBIR AQUÍ EL CÓDIGO DEL SERVLET
    	
    	// ACCESO A LA INFORMACIÓN RECIBIDA
    	// ---------------------------------------------------------------
    	// Devuelve la cadena de texto de la URL después del path.
    	request.getQueryString();
    	// Devuelve el valor de un parámetro
    	request.getParameter("nombreParam");
    	// Utilizado para parémetros que pueden tomar varios valores
    	request.getParameterValues("nombreParam");
    	// Devuelve una lista con los nombres de los parámetros obtenidos
    	request.getParameterNames();
    	
    	// CÓDIGOS HTTP DE RESPUESTA
    	// ---------------------------------------------------------------
    	// Para enviar un error:
    	response.sendError(404); // Puede ponerse en el catch de alguna excepción -> try(algo...) catch(Exception) {send404}
    	
    	// COOKIES
    	// ---------------------------------------------------------------
    	// 1. Creación de una cookie
    	Cookie cookie = new Cookie("FDI_UCM", "Aprendiendo sistemas web");
    	cookie.setMaxAge(24*3600);
    	response.addCookie(cookie);
  
    	// 2. Obtención de una cookie
    	PrintWriter out = response.getWriter();
    	if(request.getCookies() == null) {
    		out.println("No hay cookies");
    	}
    	for (Cookie it: request.getCookies()) {
    		if(it.getName().equals("FDI_UCM"))
    			out.println("Estás... " + cookie.getValue());
    	}
    	
    	// SESIONES
    	// ---------------------------------------------------------------
    	// Devuelve la sesión actual, y si no existe la crea
    	HttpSession sesion = request.getSession();
    	// Indica si la sesióna caba de crearse
    	sesion.isNew();
    	// Indica el tiempo máximo (en segundos) de validez de la sesión. Después
    	// de ese tiempo, el contenedor de servlets la invalidará
    	sesion.setMaxInactiveInterval(5*3600);
    	// Invalida la sesión
    	sesion.invalidate();
    	// Añade un atributo a la sesión
    	sesion.setAttribute("Nombre_ATR", "Contenido ATR");
    	// Devuelve un atributo de la sesión
    	sesion.getAttribute("Nombre_ATR");
    	// Borra un atributo
    	sesion.removeAttribute("Nombre_ATR");
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
