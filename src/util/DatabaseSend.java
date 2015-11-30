package util;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.google.gson.Gson;

import beans.Ejercicios;
import beans.Glucemias;
import beans.Insulinas;
import beans.Pacientes;
import beans.Pesos;
import beans.Pruebas;
import beans.Recomendacion;

@Path("/doctor")
public class DatabaseSend {
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public static void setPaciente(Gson pac) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Pacientes p = new Pacientes();
		p.setName(pac.fromJson("name", String.class));
		p.setSurname1(pac.fromJson("surname1", String.class));
		p.setSurname2(pac.fromJson("surname2", String.class));
		p.setBirthdate(pac.fromJson("birthdate", Date.class));
		p.setDni(pac.fromJson("dni", String.class));
		p.setEmail(pac.fromJson("email", String.class));
		p.setHeight(pac.fromJson("height", Integer.class));
		p.setDiabetesType(pac.fromJson("diabetesType", String.class));
		p.setGender(pac.fromJson("gender", String.class));
		p.setPassword(pac.fromJson("password", String.class));
		p.setIllnesses(pac.fromJson("illnesses", String.class));
		p.setMedication(pac.fromJson("medication", String.class));

		session.save(p);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public static void setPeso(Gson peso) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Pesos p = new Pesos();
		p.setIdPac(peso.fromJson("idPac", Integer.class));
		p.setDate(peso.fromJson("date", Date.class));
		p.setValue(peso.fromJson("value", Double.class));

		session.save(p);

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Pacientes pac = (Pacientes) session.get(Pacientes.class, peso.fromJson("idPac", Integer.class));
			pac.setWeight(peso.fromJson("value", Double.class));
			session.update(pac);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public static void setPrueba(Gson pru) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Pruebas p = new Pruebas();
		p.setIdPac(pru.fromJson("idPac", Integer.class));
		p.setDate(pru.fromJson("date", Date.class));
		p.setValue(pru.fromJson("value", String.class));

		session.save(p);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public static void setGlucemia(Gson glu) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Glucemias g = new Glucemias();
		g.setIdPac(glu.fromJson("idPac", Integer.class));
		g.setDate(glu.fromJson("date", Date.class));
		g.setValue(glu.fromJson("value", Integer.class));

		session.save(g);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public static void setInsulina(Gson ins) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Insulinas i = new Insulinas();
		i.setIdPac(ins.fromJson("idPac", Integer.class));
		i.setDate(ins.fromJson("date", Date.class));
		i.setValue(ins.fromJson("value", Integer.class));

		session.save(i);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public static void setEjercicio(Gson ejr) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Ejercicios e = new Ejercicios();
		e.setIdPac(ejr.fromJson("idPac", Integer.class));
		e.setDate(ejr.fromJson("date", Date.class));
		e.setLength(ejr.fromJson("length", Integer.class));
		e.setIntensity(ejr.fromJson("intensity", Integer.class));

		session.save(e);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public static void setRecomendacion(Gson rec) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Recomendacion r = new Recomendacion();
		r.setTitulo(rec.fromJson("titulo", String.class));
		r.setDesc(rec.fromJson("desc", String.class));
		r.setPrio(rec.fromJson("prio", Integer.class));
		r.setCausa(rec.fromJson("causa", String.class));

		session.save(r);
	}

}
