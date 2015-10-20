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
	
	/**
	 * Devuelve la contraseña (hasheada) del usuario indicado
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
