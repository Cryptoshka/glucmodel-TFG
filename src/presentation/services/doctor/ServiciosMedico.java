package presentation.services.doctor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import integration.database.DBFunctions;

/**
 * Clase que agrupa los servicios que puede requerir un usuario de tipo médico
 * que desee obtener o crear información relacionada con sus pacientes.
 * @author amiedes
 */
@Path("/doctor")
public class ServiciosMedico {

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
	public Response returnBrandGET(
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
   
	
	/**
	 * Devuelve la información básica del paciente: nombre y apellidos, peso, altura, enfermedades...
	 * Acceso: http://localhost:8080/glucmodel/api/doctor/XXX
	 * @param id ID del paciente.
	 * @return String con los datos del paciente en formato JSON.
	 */
	@Path("/ficha/{id_paciente}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFichaPaciente(@PathParam("id_paciente") Integer id) {
		String ret = null;
		return Response.ok(ret).build();
	}
	
	/**
	 * Devuelve los últimos pesos del paciente en formato JSON.
	 * Acceso: http://localhost:8080/glucmodel/api/doctor/peso/XXX
	 * @param id ID del paciente.
	 * @return String con los pesos del paciente en formato JSON.
	 */
	@Path("/peso/{id_paciente}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPesosPaciente(@PathParam("id_paciente") Integer id) {
		String ret = null;
		return Response.ok(ret).build();
	}
	
	/**
	 * Devuelve los últimos glucemias del paciente en formato JSON.
	 * Acceso: http://localhost:8080/glucmodel/api/doctor/peso/XXX
	 * @param id ID del paciente.
	 * @return String con los pesos del paciente en formato JSON.
	 */
	@Path("/glucemias/{id_paciente}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlucemiasPaciente(@PathParam("id_paciente") Integer id) {
		String ret = null;
		return Response.ok(ret).build();
	}
	
	/**
	 * Devuelve las últimas medidas de insulina del paciente en formato JSON.
	 * Acceso: http://localhost:8080/glucmodel/api/doctor/peso/XXX
	 * @param id ID del paciente.
	 * @return String con las medidas de insulina del paciente en formato JSON.
	 */
	@Path("/insulina/{id_paciente}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInsulinaPaciente(@PathParam("id_paciente") Integer id) {
		String ret = null;
		return Response.ok(ret).build();
	}
}
