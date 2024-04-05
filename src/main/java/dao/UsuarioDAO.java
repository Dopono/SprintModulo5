package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import basedatos.Conexion;
import model.Capacitacion;
import model.Usuario;


public class UsuarioDAO{

	Connection conn;
	ResultSet rs;
	PreparedStatement ps;
	
	public UsuarioDAO () {
	}

	public static ArrayList<Usuario> listarUsuarios() {
		ArrayList<Usuario> lista= new ArrayList<Usuario>();
		Usuario user;
		ResultSet rs;
		PreparedStatement ps;
		try {
			Connection conn = Conexion.getConexion();
		    ps = conn.prepareStatement("SELECT * FROM usuarios");
			rs = ps.executeQuery();
			while (rs.next()) {
				user = new Usuario();
				user.setId(rs.getInt(1));
				user.setNombre(rs.getString(2));
				user.setTipo(rs.getString(3));
				lista.add(user);
			}
		}catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return lista;
	}
		
	public static boolean agregarUsuario(Usuario user) {
		PreparedStatement ps;
		boolean exito = true;
		try {
			Connection conn = Conexion.getConexion();
			 ps = conn.prepareStatement("insert into usuarios(nombre, tipo) values (?, ?)");
	         ps.setString(1, user.getNombre());
	         ps.setString(2, user.getTipo());
	         ps.execute();
			 ps.close();
			 conn.close();
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			exito = true;
		}
		return exito;
	}
	
	
	public static boolean eliminarUsuario(int id) {
		PreparedStatement ps;
		boolean exito = true;
		try {
			Connection conn = Conexion.getConexion();
		    ps = conn.prepareStatement("delete from usuarios where id =?");
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
	
	public static Usuario obtenerUsu(int id) {
		Usuario usu = null;
		ResultSet rs;
		PreparedStatement ps;
		try {
			Connection conn = Conexion.getConexion();
			 ps = conn.prepareStatement("select * from usuarios where id =?");
			 ps.setInt(1, id);
			 rs= ps.executeQuery();
			 while (rs.next()) {
	                String nombre = rs.getString("nombre");
	                String tipo = rs.getString("tipo");
	                usu = new Usuario(id, nombre, tipo);}
			
			
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return usu;
		
	}
	 
	public static Usuario modificarUsu(Usuario usu) {
		ResultSet rs;
		PreparedStatement ps;
		try {
			Connection conn = Conexion.getConexion();
			 ps = conn.prepareStatement("update usuarios set nombre=?, detalle=? where id=?");
			 ps.setString(1, usu.getNombre());
			 ps.setString(2, usu.getTipo());
			 ps.setInt(3, usu.getId());
			 ps.execute();
			 ps.close();
			 conn.close();
			
			
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return usu;
		
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	      
	      
	       
		


