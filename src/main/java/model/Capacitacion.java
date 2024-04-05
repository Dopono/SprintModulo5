package model;

public class Capacitacion {
	protected int id;
	protected String nombre;
	protected String detalle;
	
	
	public Capacitacion() {
	}


	
	public Capacitacion(int id, String nombre, String detalle) {
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
	}




	public Capacitacion(String nombre, String detalle) {
		this.nombre = nombre;
		this.detalle = detalle;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
	
}
