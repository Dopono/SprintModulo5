package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	
	private static String driver = "com.mysql.jdbc.Driver";
	private static String databaseName= "prevencion_riesgos";
	private static String url = "jdbc:mysql://localhost:3306/" + databaseName;
	private static String userName = "root";
	private static String password= "1234";
	
	public static Connection getConexion() {
		Connection conn = null;
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("Conexión existosa");
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}
	
}

