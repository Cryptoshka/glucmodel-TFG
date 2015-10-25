package services.other;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestJerseyServices {
	
	/**
	 * Servicio web para realizar pruebas.
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}
}
	
	