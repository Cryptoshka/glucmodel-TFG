package database;

import java.sql.*;

public class DBGlucmodel {
	
	// Atributos
	private java.sql.Connection conexion;
	private java.sql.Statement sentenciaSQL;
	private java.sql.ResultSet cdr; // conjunto de resultados
	
	// Constructora
	public DBGlucmodel() throws ClassNotFoundException, java.sql.SQLException, InstantiationException, IllegalAccessException {
		// Cargar el controlador JDBC
		String controlador = "com.mysql.jdbc.Driver";
		// Creamos un objeto de la clase controlador JDBC
		Class.forName(controlador).newInstance();
		conectar(); // conectar con la fuente de datos
	}
	
	/**
	 * Configura los parámetros de conexión a la BD y la crea.
	 * @throws SQLException si no encuentra el driver (en este caso el de MySQL)
	 */
	public void conectar() throws SQLException {
		
		// Parámetros de la conexión
		String URL_bd = "jdbc:mysql://127.0.0.1:3306/glucmodel";
		String usuario = "admin";
		String password = "EuQaLmDm;";
		
		// Realizamos la conexión
		conexion = DriverManager.getConnection(URL_bd, usuario, password);
		
		// Crear una sentencia SQL
		sentenciaSQL = conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_UPDATABLE);

		System.out.println("\nConexión realizada con éxito.\n");
		
		// Mostramos las tablas de la BD
		System.out.println("Tablas de la base de datos: ");
		String[] tablas = tablas();
		for (String nombreTabla : tablas)
			System.out.println(nombreTabla);
	}
	
	/**
	 * Cierra la conexión con la BD. Aunque al cerrar la conexión se cierran automáticamente
	 * la sentenciaSQL y ResultSet, es una buena práctica hacerlo explícitamente.
	 */
	public void cerrarConexion() throws SQLException {
		if (cdr != null) cdr.close();
		if (sentenciaSQL != null) sentenciaSQL.close();
		if (conexion != null) conexion.close();
	}
	
	/**
	 * Muestra las tablas de la BD
	 */
	public String[] tablas() throws SQLException {
		cdr = sentenciaSQL.executeQuery("SHOW TABLES");
		cdr.last(); // mover cursor a la última fila
		String[] tablas = new String[cdr.getRow()];
		
		cdr.beforeFirst(); // mover cursor a su posición inicial
		int i = 0;
		while(cdr.next())
			tablas[i++] = cdr.getString(1);
		
		return tablas;
	}
	
	/**
	 * Comprueba si existe el usuario indicado
	 */
	public boolean existeUsuario(String usr) throws SQLException {
		
		String consulta = "SELECT * FROM usuarios WHERE EMAIL='" + usr + "'";
		System.out.println("Ejecutando: " + consulta);
		cdr = sentenciaSQL.executeQuery(consulta);
		cdr.last(); // mover cursor a la última fila
		String[] tablas = new String[cdr.getRow()];
		
		cdr.beforeFirst(); // mover cursor a su posición inicial
		int i = 0;
		System.out.println("Imprimiento resultado...");
		while(cdr.next())
			tablas[i++] = cdr.getString(1);
		
		System.out.println(tablas[0]);
		System.out.println(tablas[1]);
		System.out.println(tablas[2]);
		
		return true;
	}

	public void infoBasica(String mail) throws SQLException {
		
	}
}