package presentation.services.other;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import business.pojos.InfoLogin;
import integration.dao.DAOInfoLogin;

@Path("/login")
public class Login {
	
	/**
	 * Comprueba si el usuario y la constaseña son correctas y devuelve 
	 * la sesión si lo son.
	 * NOTA: temporalmente está todo el la capa de presentación, pero luego lo repartiré.
	 * @param req
	 * @return Devuelve el ID de usuario correspondiente o -1 si no existe o no es correcto.
	 */
	@POST
    public int iniciaSesion(@Context HttpServletRequest req, 
    						@QueryParam("email") String email, @QueryParam("pwd") String pwd) {
		
		InfoLogin info = null;
		DAOInfoLogin dao = new DAOInfoLogin();
		
		// Comprobar usr y pwd correctos
		try {
			info = dao.getUsrInfo(email, pwd);
		} catch (Exception e) {
			e.printStackTrace();
			//return Response.status(500).entity("Server was not able to process your request").build();
		}
		
		
		if (info.getUsr_id() > 0) {
			// Devuelve la sesión actual, y si no existe la crea.
	    	HttpSession session = req.getSession();

	    	// Añadir a la sesión el ID, nombre y tipo de usuario
	    	session.setAttribute("usr_id", info.getUsr_id());
	    	session.setAttribute("name", info.getName());
	    	session.setAttribute("usr_type", info.getUsr_type());
		}
		return info.getUsr_id();
    }

}


    