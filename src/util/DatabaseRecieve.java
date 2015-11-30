package util;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.google.gson.Gson;

import beans.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/doctor")
public class DatabaseRecieve {
	Session session = null;

	public DatabaseRecieve() {
		this.session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	@Path("/lista/{id_med}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPatients(@PathParam("id_med") int idMed) {
		List<Pacientes> list = null;
		Gson parser = null;
		String ret = "[";
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session.createQuery(
					"select p.name, p.surname1, p.surname2, p.idPacientes from Pacientes as p where p.idDoctor = "
							+ idMed + " order by p.idPacientes");
			list = (List<Pacientes>) q.list();
			Iterator<Pacientes> iter = list.iterator();

			parser = new Gson();

			while (iter.hasNext()) {
				Pacientes aux = iter.next();
				ret += parser.toJson(aux);

				if (iter.hasNext())
					ret += ",";
			}
			ret += "]";
			tx.commit(); // hay que cerrar?
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		return Response.ok(ret).build();
	}

	@SuppressWarnings("unchecked")
	@Path("/lista-rec")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRecomendations() {
		List<Object> list = null;
		Gson parser = null;
		String ret = "[";
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session.createQuery(
					"select p.name, p.idPacientes, r.titulo, r.idRecomendacion, r.desc, r.date, r.prio from Pacientes as p, Recomendacion as r where p.idPacientes = r.idPac");
			list = (List<Object>) q.list();
			Iterator<Object> iter = list.iterator();

			parser = new Gson();

			while (iter.hasNext()) {
				Object aux = iter.next();
				ret += parser.toJson(aux);

				if (iter.hasNext())
					ret += ",";
			}
			ret += "]";
			tx.commit(); // hay que cerrar?
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		//return Response.ok(ret).build();
		return Response.status(200).entity("Hola").build();
	}

	@SuppressWarnings("unchecked")
	@Path("/ficha/{id_pac}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPatient(@PathParam("id_pac") int idPac) {
		List<Pacientes> list = null;
		Gson parser = null;
		String ret = "[";
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session.createQuery(
					"select p.name, p.weight, p.height, p.diabetesType, p.illnesses, p.medication from Pacientes as p where p.idPacientes = "
							+ idPac + "");
			list = (List<Pacientes>) q.list();
			Iterator<Pacientes> iter = list.iterator();

			parser = new Gson();

			while (iter.hasNext()) {
				Pacientes aux = iter.next();
				ret += parser.toJson(aux);

				if (iter.hasNext())
					ret += ",";
			}
			ret += "]";
			tx.commit(); // hay que cerrar?
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		return Response.status(200).entity(ret).build();
	}

	@SuppressWarnings("unchecked")
	@Path("/pesos/{id_pac}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPesos(@PathParam("id_pac") int idPac) {
		List<Pesos> list = null;
		Gson parser = null;
		String ret = "[";
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session.createQuery("select p.date, p.value from Pesos as p where p.idPac = " + idPac + "");
			list = (List<Pesos>) q.list();
			Iterator<Pesos> iter = list.iterator();

			parser = new Gson();

			while (iter.hasNext()) {
				Pesos aux = iter.next();
				ret += parser.toJson(aux);

				if (iter.hasNext())
					ret += ",";
			}
			ret += "]";
			tx.commit(); // hay que cerrar?
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		return Response.ok(ret).build();
	}

	@SuppressWarnings("unchecked")
	@Path("/glucemias/{id_pac}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlucemias(@PathParam("id_pac") int idPac) {
		List<Glucemias> list = null;
		Gson parser = null;
		String ret = "[";
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session.createQuery("select g.date, g.value from Glucemias as g where g.idPac = " + idPac + "");
			list = (List<Glucemias>) q.list();
			Iterator<Glucemias> iter = list.iterator();

			parser = new Gson();

			while (iter.hasNext()) {
				Glucemias aux = iter.next();
				ret += parser.toJson(aux);

				if (iter.hasNext())
					ret += ",";
			}
			ret += "]";
			tx.commit(); // hay que cerrar?
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		return Response.ok(ret).build();
	}

	@SuppressWarnings("unchecked")
	@Path("/insulinas/{id_pac}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInsulinas(@PathParam("id_pac") int idPac) {
		List<Insulinas> list = null;
		Gson parser = null;
		String ret = "[";
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session.createQuery("select i.date, i.value from Insulinas as i where i.idPac = " + idPac + "");
			list = (List<Insulinas>) q.list();
			Iterator<Insulinas> iter = list.iterator();

			parser = new Gson();

			while (iter.hasNext()) {
				Insulinas aux = iter.next();
				ret += parser.toJson(aux);

				if (iter.hasNext())
					ret += ",";
			}
			ret += "]";
			tx.commit(); // hay que cerrar?
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		return Response.ok(ret).build();
	}

	@SuppressWarnings("unchecked")
	@Path("/ejercicios/{id_pac}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEjercicios(@PathParam("id_pac") int idPac) {
		List<Ejercicios> list = null;
		Gson parser = null;
		String ret = "[";
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session.createQuery(
					"select e.date, e.length, e.intensity from Ejercicios as e where e.idPac = " + idPac + "");
			list = (List<Ejercicios>) q.list();
			Iterator<Ejercicios> iter = list.iterator();

			parser = new Gson();

			while (iter.hasNext()) {
				Ejercicios aux = iter.next();
				ret += parser.toJson(aux);

				if (iter.hasNext())
					ret += ",";
			}
			ret += "]";
			tx.commit(); // hay que cerrar?
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		return Response.ok(ret).build();
	}

	@SuppressWarnings("unchecked")
	@Path("/recomendaciones/{id_pac}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRecomendationsEnviadas(@PathParam("id_pac") int idPac) {
		List<RecoEnv> list = null;
		Gson parser = null;
		String ret = "[";
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query q = session.createQuery(
					"select r.idRecomendacion, r.titulo, r.desc, r.date, r.prio from Recomendacion as r, RecoEnv as e where r.idRecomendacion = e.idRecoEnv and e.idPac = "
							+ idPac + "");
			list = (List<RecoEnv>) q.list();
			Iterator<RecoEnv> iter = list.iterator();

			parser = new Gson();

			while (iter.hasNext()) {
				RecoEnv aux = iter.next();
				ret += parser.toJson(aux);

				if (iter.hasNext())
					ret += ",";
			}
			ret += "]";
			tx.commit(); // hay que cerrar?
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to process your request").build();
		}
		return Response.ok(ret).build();
	}
}
