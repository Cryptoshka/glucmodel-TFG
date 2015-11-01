package presentation.services.other;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import integration.database.DBFunctions;

@Path("/html")
public class ImportHtml {
	
	/**
	 * Devuelve la cabecera de la página en formato HTML
	 * Acceso: http://localhost:8080/glucmodel/api/html/header
	 * @return La cabecera de la web.
	 */
	@Path("/header")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response returnPageHeader() {
		
		String ret = null;
		return Response.ok(ret).build();
	}
	
	/**
	 * Devuelve el footer de la página en formato HTML
	 * Acceso: http://localhost:8080/glucmodel/api/html/footer
	 * @return El footer de la web.
	 */
	@Path("/footer")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response returnPageFooter() {
		
		String ret = null;
		return Response.ok(ret).build();
	}
}
