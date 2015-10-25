package services.doctor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import database.DBFunctions;

/**
 * Clase que agrupa los servicios que puede requerir un usuario de tipo médico
 * que desee obtener o crear información relacionada con sus pacientes.
 * @author amiedes
 */
@Path("/v1/medico")
public class V1_ServiciosMedico {

	/**
	 * Devuelve id, nombre y apellidos de los pacientes de un médico en concreto
	 * en formato JSON.
	 * Acceso: http://localhost:8080/glucmodel/api/v1/medico?id=123
	 * @param id ID del médico.
	 * @return String con los datos de los pacientes en formato JSON.
	 * @throws Exception
	 */
	@Path("/lista/{id_medico}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response returnBrand(
			@PathParam("id_medico") Integer id)
			throws Exception {
		
		String ret = null;
		
		try {
			
			DBFunctions dao = new DBFunctions();
			ret = dao.queryReturnPatientList(id);

		} 
		catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		
		return Response.ok(ret).build();
	}
}
