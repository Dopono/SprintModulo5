package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import basedatos.Conexion;
import model.Capacitacion;


public class CapacitacionDAO {
	
	


	public static ArrayList<Capacitacion> selecionarCapacitacion() {
		ArrayList<Capacitacion> lista= new ArrayList<Capacitacion>();
		Capacitacion cap;
		ResultSet rs;
		PreparedStatement ps;
		try {
			Connection conn = Conexion.getConexion();
		    ps = conn.prepareStatement("select * from capacitaciones");
			rs = ps.executeQuery();
			while (rs.next()) {
				cap = new Capacitacion();
				cap.setId(rs.getInt(1));
				cap.setNombre(rs.getString(2));
				cap.setDetalle(rs.getString(3));
				lista.add(cap);
				  
			}
		}catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return lista;
	}
	

	public static boolean agregarCapacitacion(Capacitacion cap) {
		PreparedStatement ps;
		boolean exito = true;
		try {
			Connection conn = Conexion.getConexion();
		    ps = conn.prepareStatement("insert into capacitaciones (nombre, detalle) values ( ?, ?)");
			ps.setString(1, cap.getNombre());
			ps.setString(2, cap.getDetalle());
		    ps.execute();
		    ps.close();
		    conn.close();
				
		}catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			exito = false;
		}
		
		return exito;	
	}

	public static boolean eliminarCapacitacion(int id) {
		PreparedStatement ps;
		boolean exito = true;
		try {
			Connection conn = Conexion.getConexion();
		    ps = conn.prepareStatement("delete from capacitaciones where id =?");
			ps.setInt(1, id);
		    ps.execute();
		    ps.close();
		    conn.close();
				
		}catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
			exito = false;
		}
		return exito;
		
	}
	
	public static Capacitacion obtenerCap(int id) {
		Capacitacion cap = null;
		ResultSet rs;
		PreparedStatement ps;
		try {
			Connection conn = Conexion.getConexion();
			 ps = conn.prepareStatement("select * from capacitaciones where id =?");
			 ps.setInt(1, id);
			 rs= ps.executeQuery();
			 while (rs.next()) {
	                String nombre = rs.getString("nombre");
	                String detalle = rs.getString("detalle");
	                cap = new Capacitacion(id, nombre, detalle);}
			
			
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return cap;
		
	}
	 
	public static Capacitacion modificarCap(Capacitacion cap) {
		ResultSet rs;
		PreparedStatement ps;
		try {
			Connection conn = Conexion.getConexion();
			 ps = conn.prepareStatement("update  capacitaciones set nombre=?, detalle=? where id=?");
			 ps.setString(1, cap.getNombre());
			 ps.setString(2, cap.getDetalle());
			 ps.setInt(3, cap.getId());
			 ps.execute();
			 ps.close();
			 conn.close();
			
			
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return cap;
		
	}
	
}	