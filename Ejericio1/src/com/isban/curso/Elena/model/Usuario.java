package com.isban.curso.Elena.model;

public class Usuario {

	
	// creamos las variables/atributos de la clase usuario
	
	public Integer id;
	public String  nombre;
	public String  password;
	
	// creamos el constructor
	
	public Usuario(Integer id, String nombre, String password) {
		// super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
	}
		
	// creamos los metodos gets y sets de esta clase. 
	//boton derecho source generate get/set o constructor
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
