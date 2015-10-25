package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBFunctions extends Database {
	
	/**
	 * 
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

}
