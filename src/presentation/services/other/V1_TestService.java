package presentation.services.other;

import java.util.Iterator;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import integration.database.DBFunctions;

@Path("/v1/test")
public class V1_TestService {

	/**
	 * Método para probar si Jersey redirecciona correctamente las peticiones
	 * HTTP al servicio web.
	 * Acceso: http://localhost:8080/glucmodel/api/test
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "El servicio de prueba funciona";
	}

	/**
	 * Método para probar la conexión con la BD. Devuelve las tablas de ésta en
	 * formato JSON. Si no hay tablas, devolverá un JSON vacío = "[]"
	 * Acceso: http://localhost:8080/glucmodel/api/test/show_tables
	 * @return String con las tablas de la BD en formato JSON
	 * @throws Exception
	 */
	@Path("show_tables")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response muestraTablas() throws Exception {
		
		List<String> tables = null;
		String ret = "[";
		
		try {
			
			DBFunctions dao = new DBFunctions();
			tables = dao.getTables(); // null if empty set
			
			// Convert List<String> to JSON format. Both key and value are the same.
			String elem = null;
			Iterator<String> it = tables.iterator();
			while(it.hasNext()) {
				elem = it.next();
				ret += "{\"" + elem + "\":\"" + elem + "\"}";
				if(it.hasNext())
					ret += ",";
			}
			ret += "]";
			System.out.println(ret);
			
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		} 

		return Response.ok(ret).build();
	}

}
