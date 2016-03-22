package com.tabla.usuarios;

public class Persona {
	
	private int idUsuario;
	private String nombre;
	private String nombreUsuario;
	private String email;
	private String libro;
	
	
	public Persona(int idUsuario, String nombre, String nombreUsuario, String email, String libro) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.libro = libro;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) {
		this.libro = libro;
	}
	
	@Override
	public String toString() {
		return "Persona [idUsuario=" + idUsuario + ", nombre=" + nombre + ", nombreUsuario=" + nombreUsuario
				+ ", email=" + email + ", libro=" + libro + "]";
	}
	
	

}
