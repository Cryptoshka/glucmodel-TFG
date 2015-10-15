package database;

import java.sql.SQLException;

public class FuncionesBD {
	
	private static DBGlucmodel BD;
	
	/**
	 * Abre una conexión con la base de datos de Glucmodel
	 */
	public static void conectar() {
		try {
			BD = new DBGlucmodel();
			BD.conectar();
		} catch (Exception e) {
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
	 * 
	 */
	public static boolean checkUserExists(String usr_email) {
		try {
			BD.existeUsuario(usr_email);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	/**
	 *
	 */
	public static void getInfoBasicaPaciente(String mail){
		if (checkUserExists(mail)){
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
		if (checkUserExists(mail)){
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
		if (checkUserExists(mail)){
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
		if (checkUserExists(mail)){
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
		if (checkUserExists(mail)){
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
		if (checkUserExists(mail)){
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
		if (checkUserExists(mail)){
			try {
				BD.getPruebas(BD.dameID());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
