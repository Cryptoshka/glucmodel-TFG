package integration.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import beans.InfoPacienteLista;

public class DBFunctions extends Database {
	
	/**
	 * @return A List<String> with the database table names.
	 * @throws Exception
	 */
	public List<String> getTables() throws Exception {
		
		PreparedStatement query = null;
		Connection conn = null;
		List<String> ret = null;
		
		try {
			conn = dbConnection();
			query = conn.prepareStatement("show tables");
			
			ResultSet rs = query.executeQuery();

			ret = new ArrayList<String>();
			
			while(rs.next()) {
				//System.out.println("Añadimos: " + rs.getString(1));
				ret.add(rs.getString(1));
			}
		}
		catch(SQLException sqlError) {
			sqlError.printStackTrace();
			return ret;
		}
		catch(Exception e) {
			e.printStackTrace();
			return ret;
		}
		finally {
			if (query != null) query.close();
			//!! if (conn != null) conn.close();
		}
		return ret;
	}

	public String queryReturnPatientList(int id_medico) throws Exception {
		
		PreparedStatement query = null;
		Connection conn = null;
		Gson parser = null;
		String ret = "[";
		InfoPacienteLista info = null;
		
		try {
			conn = dbConnection();

			// Prepare query
			query = conn.prepareStatement(
					"select ID, NAME, SURNAME1, SURNAME2 from usuarios where IDDOCTOR = ?");	
			query.setInt(1, id_medico);
			
			ResultSet rs = query.executeQuery();
			
			parser = new Gson();
			info = new InfoPacienteLista();
			
			// Iterate through all ResultSet and parse it to JSON
			while (rs.next()) {
				
				info.setId(rs.getInt("ID"));
				info.setName(rs.getString("NAME"));
				info.setSurname1(rs.getString("SURNAME1"));
				info.setSurname2(rs.getString("SURNAME2"));
				
				ret += parser.toJson(info);
				
				if(!rs.isLast())
					ret += ",";
			}
			ret += "]";
			
			//!! query.close(); //close connection
		}
		catch(SQLException sqlError) {
			sqlError.printStackTrace();
			return ret;
		}
		catch(Exception e) {
			e.printStackTrace();
			return ret;
		}
		finally {
			if (query != null) query.close();
			//!! if (conn != null) conn.close();
		}
		System.out.println(ret);
		return ret;
	}
}
