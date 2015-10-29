package integration.database;

import java.sql.*;

public class Database {
	
	private static Connection connection = null;
	
	// Parámetros de acceso
	private static final String HOST = "127.0.0.1";
	private static final String PORT = "3306";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "toor";
	private static final String DATABASE = "glucmodel";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	
	/** Esto debería quedarse como public */
	private static Connection getConnection() throws Exception {
		
		// Si ya existía una conexión, devolvemos la existente.
		if (connection != null)
			return connection;
		
		// E.o.c. creamos una nueva
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.err.println("[DB MSG] Error instanciando el driver JDBC.");
			e.printStackTrace();
		}
		
		System.out.println("[DB MSG] MySQL JDBC Driver Registrado correctamente!");
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE, USERNAME, PASSWORD);
		} catch (SQLException e) {
			System.err.println("[DB MSG] Conexión a la base de datos fallida! Comprueba la consola.");
			e.printStackTrace();
		}
		
		if (connection != null) {
			System.out.println("[DB MSG] Conexión correcta a la base de datos.");
		} else {
			System.err.println("[DB MSG] Error conectando a la base de datos.");
		}
		
		return connection;
	}
	
	/**
	 * Cierra la conexión con la BD.
	 */
	public static void closeConnection() {
		try {
			if (connection != null) connection.close();
		} catch (SQLException e) {
			System.err.println("[DB MSG] Error al desconectar de la base de datos.");
			e.printStackTrace();
		}
	}
	
	/** 
	 * Sólo pueden llamarlo clases de este paquete  
	 */
	protected static Connection dbConnection() {
		Connection conn = null;
		try {
			conn = Database.getConnection();
			return conn;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}