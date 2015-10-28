package database;

import java.sql.SQLException;
import java.util.LinkedList;

import beans.InfoBasicaPaciente;
import beans.MedidaPeso;
import beans.NombresPacientes;

public class FuncionesBD {
	
	private static DBGlucmodel BD;
	
	/**
	 * Abre una conexión con la base de datos de Glucmodel
	 */
	public static void conectar() {
		try {
			BD = new DBGlucmodel();
			BD.conectar();
		} catch (SQLException | IllegalAccessException e) {
			System.out.println("ERROR AL ABRIR LA CONEXIÓN DE LA BD");
			e.printStackTrace();
		}
	}
	
	/**
	 * Cierra una conexión con la base de datos de glucmodel
	 */
	public static void desconectar() {
		try {
			BD.cerrarConexion();
		} catch (SQLException e) {
			System.out.println("ERROR AL CERRAR LA CONEXIÓN DE LA BD");
			e.printStackTrace();
		}
	}
	
	/**
	 * Comprueba si un usuario existe.
	 */
	public static boolean checkUserExists(String usr_email, InfoLogin info) {
		try {
			BD.existeUsuario(usr_email, info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	public static void getInfoBasicaPaciente(String mail){
		if (checkUserExists(mail, null)){
			try {
				BD.infoBasica(BD.dameID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 *
	 */
	public static void getPesoPaciente(String mail){
		if (checkUserExists(mail, null)){
			try {
				BD.getPeso(BD.dameID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 *
	 */
	public static void getGlucemiasPaciente(String mail){
		if (checkUserExists(mail, null)){
			try {
				BD.getGlucemias(BD.dameID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 *
	 */
	public static void getInsulinaPaciente(String mail){

		if (checkUserExists(mail, null)){

			try {
				BD.getInsulina(BD.dameID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 *
	 */
	public static void getDietaPaciente(String mail){
		if (checkUserExists(mail, null)){
			try {
				BD.getDieta(BD.dameID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 *
	 */
	public static void getEjercicioPaciente(String mail){
		if (checkUserExists(mail, null)){
			try {
				BD.getEjercicio(BD.dameID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 *
	 */
	public static void getPruebasPaciente(String mail){
		if (checkUserExists(mail, null)){
			try {
				BD.getPruebas(BD.dameID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	 /* Devuelve la contraseña (hasheada) del usuario indicado
	 */
	public static String getUsrPwd(String usr_email) {
		String usr_hash = null;
		try {
			usr_hash = BD.damePwdHash(usr_email);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usr_hash;
	}
	
	/**
	 * Dado el ID de un doctor, devuelve nombre y apellidos de sus pacientes.
	 */
	public static NombresPacientes dameNombrePacientes(int id_doctor) {
		try {
			return BD.dameNombrePacientes(id_doctor);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Dado el ID de un paciente, devuelve su información básica para la ficha de presentación al médico.
	 */
	public static InfoBasicaPaciente dameInfoBasicaPaciente(int id_paciente) {
		try {
			return BD.dameInfoBasicaPaciente(id_paciente);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Dado el ID de un paciente, devuelve las medidas de peso que tiene almacenadas.
	 */
	public static LinkedList<MedidaPeso> damePesos(int id_paciente) {
		try {
			return BD.damePesos(id_paciente);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
