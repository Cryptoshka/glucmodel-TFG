package services.doctor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Clase que agrupa los servicios que puede requerir un usuario de tipo médico
 * que desee obtener o crear información relacionada con sus pacientes.
 * @author amiedes
 */
public class V1_ServiciosPacientes {

	/**
	 * Igual que el de arriba pero haciendo que parte del path sea el parámetro
	 * Ej: http://localhost:8080/com.youtube.rest-ep5/api/v2/inventory/INTEL
	 */
	/*@Path("/{brand}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response returnBrand(
			@PathParam("brand") String brand)
			throws Exception {
		
		String returnString = null;
		JSONArray json = new JSONArray();
		
		try {
			
			DatabaseSchema dao = new DatabaseSchema();
			
			json = dao.queryReturnBrandParts(brand);
			
			returnString = json.toString();
		} 
		catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		
		return Response.ok(returnString).build();
	}*/
}
