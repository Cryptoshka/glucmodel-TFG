package integration.database;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

import beans.InfoBasicaPaciente;
import beans.MedidaPeso;
import beans.NombresPacientes;

public class DBGlucmodel {
	
	// Atributos
	private java.sql.Connection conexion;
	private java.sql.Statement sentenciaSQL;
	private java.sql.ResultSet cdr; // conjunto de resultados
	
	// Constructora
	public DBGlucmodel() throws java.sql.SQLException, IllegalAccessException {

		// Buscamos y creamos un objeto de la clase controlador JDBC
		String controlador = "com.mysql.jdbc.Driver";
		try {
			Class.forName(controlador).newInstance();
			conectar(); // conectar con la fuente de datos
		} catch (ClassNotFoundException | InstantiationException e) {
			System.out.println("Controlador JDBC no encontrado");
			e.printStackTrace();
		}
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
		/*System.out.println("Tablas de la base de datos: ");
		String[] tablas = tablas();
		for (String nombreTabla : tablas)
			System.out.println(nombreTabla);*/
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
	public boolean existeUsuario(String usr, InfoLogin info) throws SQLException {
		
		String consulta = "SELECT ID,IDDOCTOR,NAME,SURNAME1,SURNAME2,ROLCURSO FROM usuarios WHERE EMAIL='" + usr + "'";
		System.out.println("Ejecutando: " + consulta);
		cdr = sentenciaSQL.executeQuery(consulta);
		
		// Comprobamos que solo hay un usuario con este email
		cdr.last(); 													// mover cursor a la última fila
		int numRegs = cdr.getRow();
		System.out.println("El tamaño del ResultSet es " + numRegs);
		cdr.beforeFirst();												// Volvemos a la posición inicial
		
		if (numRegs == 1) {
			System.out.println("Parece que el usuario existe");
			cdr.next();
			
			// Rellenamos los campos
			info.setId(cdr.getInt("ID"));
			info.setName(cdr.getString("NAME"));
			info.setSurname1(cdr.getString("SURNAME1"));
			info.setSurname2(cdr.getString("SURNAME2"));
			
			// Comprobamos si es un medico
			int idDoc = cdr.getInt("IDDOCTOR");
			int rolcurso = cdr.getInt("ROLCURSO");
			info.setIdDoc(idDoc);
			info.setRolcurso(rolcurso);
			if(idDoc == 0 && rolcurso == 3)
				info.setEsMedico(true);
			else
				info.setEsMedico(false);
			
			// Esto habrá que cambiarlo !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			info.setLoginCorrecto(true);
				
			return true;
		} else if(numRegs > 1) {
			System.out.println("Hay más de un usuario con el mismo nombre... PROBLEMA");
			info.setLoginCorrecto(false);
			return false;
		} else if (numRegs == 0)
			System.out.println("El usuario no existe");
		info.setLoginCorrecto(false);
		return false;
	}
	
	/**
	 * Devuelve el hash de la contraseña de un usuario
	 */
	String damePwdHash(String usr_email) throws SQLException {
		
		String consulta = "SELECT PASSWORD FROM usuarios WHERE EMAIL='" + usr_email + "'";
		System.out.println("Ejecutando: " + consulta);
		cdr = sentenciaSQL.executeQuery(consulta);
		// Nos desplazamos al primer registro (sólo debería haber uno)
		cdr.next();
		String hash = cdr.getString("PASSWORD");
		System.out.println("El hash del usuario " + usr_email + " es " + hash);
		return hash;
	}
	/**
	 * Dado el ID de un doctor, devuelve el nombre, apellidos e ID de todos sus pacientes.
	 */
	public NombresPacientes dameNombrePacientes(int id_doctor) throws SQLException {
		
		String consulta = "SELECT ID,NAME,SURNAME1,SURNAME2 FROM usuarios WHERE IDDOCTOR='" + id_doctor + "'";
		System.out.println("Ejecutando: " + consulta);
		cdr = sentenciaSQL.executeQuery(consulta);
		cdr.last(); // mover cursor a la última fila
		int numPacientes = cdr.getRow();
		String[] nombres = new String[numPacientes];
		int[] ids = new int[numPacientes];
		
		cdr.beforeFirst(); // mover cursor a su posición inicial
		
		int i = 0;
		System.out.println("Imprimiento resultado...");
		while(cdr.next()) {
			nombres[i] = cdr.getString("NAME") + " " + cdr.getString("SURNAME1") + " " + cdr.getString("SURNAME2");
			ids[i] = cdr.getInt("ID");
			i++;
		}
		NombresPacientes ret = new NombresPacientes();
		ret.setIds(ids);
		ret.setNombres(nombres);
			
		return ret;
	}
	
	/**
	 * Dado el ID de un paciente, devuelve su información básica para la ficha de presentación al médico.
	 * @throws SQLException 
	 */
	public InfoBasicaPaciente dameInfoBasicaPaciente(int id_paciente) throws SQLException {
		InfoBasicaPaciente ret = new InfoBasicaPaciente();
		
		// Obtenemos NOMBRE y ALTURA
		String consulta = "SELECT NAME,SURNAME1,SURNAME2,HEIGHT FROM USUARIOS WHERE ID='" + id_paciente + "'";
		cdr = sentenciaSQL.executeQuery(consulta);
		cdr.next();
		String name = cdr.getString("NAME") + " " + cdr.getString("SURNAME1") + " " + cdr.getString("SURNAME2");
		float altura = cdr.getFloat("HEIGHT");
		ret.setAltura(altura);
		ret.setNomApell(name);
		
		// Obtenemos el útlimo PESO
		String consultaPeso = "SELECT PESO,DATE FROM PESOS WHERE IDUSER='" + id_paciente + "'";
		cdr = sentenciaSQL.executeQuery(consultaPeso);
		
		// Obtener la última fecha con una medida de peso
		cdr.next();
		Date latest = cdr.getDate("DATE");
		double peso = -1;
		Date d;
		cdr.beforeFirst();
		while(cdr.next()) {
			d = cdr.getDate("DATE");
			if(d.after(latest)) {
				latest = d;
				peso = cdr.getDouble("PESO");
			}
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ult_fecha = df.format(latest);
		System.out.println("La última fecha de la que hay un peso es " + ult_fecha + ". El peso es " + peso);
		
		// Guardar el peso en la variable de retorno
		ret.setPeso(peso);
		
		// Obtenemos el IMC
		float imc = (float) (peso/(altura*altura));
		ret.setImc(imc);
		
		// Por útlimo, guardamos el tipo TIPODIABETES, OTRAS_ENFERMEDADES, MEDICACION_ACTUAL
		// NOTA: todavía no existen estos campos en la base de datos
		ret.setTipoDiabetes(-1);
		ret.setOtrasEnfermedades(null);
		ret.setMedicacionActual(null);
		
		return ret;
	}
	
	/**
	 * Devuelve el histórico de las medidas de peso asociadas a un paciente.
	 * @throws SQLException 
	 */
	public LinkedList<MedidaPeso> damePesos(int id_paciente) throws SQLException {
		LinkedList<MedidaPeso> historico = new LinkedList<MedidaPeso>();
		
		String consulta = "SELECT PESO,DATE FROM PESOS WHERE IDUSER='" + id_paciente + "'";
		cdr = sentenciaSQL.executeQuery(consulta);
		
		MedidaPeso aux = new MedidaPeso();
		while(cdr.next()) {
			aux.setPeso(cdr.getDouble("PESO"));
			aux.setFecha(cdr.getDate("DATE"));
			historico.add(aux);
		}
		
		return historico;
	}
}