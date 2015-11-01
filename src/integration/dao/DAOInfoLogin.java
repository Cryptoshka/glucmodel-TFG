package integration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.google.gson.Gson;

import business.pojos.InfoLogin;
import business.pojos.beans_viejos.InfoPacienteLista;
import integration.database.*;

public class DAOInfoLogin {

	/**
	 * Dado un id de usuario, comprueba si existe y la constaseña es correcta
	 * e inicializa los camos de InfoLogin. Si no es correcto inicializa el campo
	 * id de InfoLogin a -1 o devuelve null.
	 * @param id
	 * @return
	 */
	public InfoLogin getUsrInfo(String email, String pwd) throws Exception {
		
		PreparedStatement query = null;
		Connection conn = null;
		InfoLogin info = null;
		
		try {
			conn = Database.dbConnection();

			// Prepare query
			query = conn.prepareStatement(
					"select ID, NAME, SURNAME1, SURNAME2, PASSWORD from usuarios where EMAIL = ?");	
			query.setString(1, email);
			
			ResultSet rs = query.executeQuery();
			
			// Comprobamos que no haya más de un usuario con el mismo email
			rs.last();
			int nUsers = rs.getRow();
			if(nUsers > 1)
				return null;
			
			// Comprobar si la contraseña es correcta
			String pwd_db = rs.getString("PASSWORD");
			if (!pwd.equals(pwd_db))
				return null;
			
			// e.o.c. establecemos la información pertinente
			rs.first();
			info = new InfoLogin();
			
			info.setUsr_id(rs.getInt("ID"));
			info.setUsr_type(rs.getInt(""));
			String ap1 = rs.getString("SURNAME1");
			String ap2 = rs.getString("SURNAME2");
			String name = rs.getString("NAME");
			if (ap1 != null) name += ap1;
			if (ap2 != null) name += ap2;
			info.setName(name);
			
			// Close connection
			query.close();
		}
		catch(SQLException sqlError) {
			sqlError.printStackTrace();
			return null;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			if (query != null) query.close();
			//!! if (conn != null) conn.close();
		}

		return info;
	}

}