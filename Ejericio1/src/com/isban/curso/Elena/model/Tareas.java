package com.isban.curso.Elena.model;

import java.util.Date;

public class Tareas {
	public Integer id;
	public Integer idUsuario;
	public String  tarea;
	public Date  fechaCreaccion;
	public Date  fechalimite;
	public String  prioridad;
	public Boolean ternminada;
	
	public Tareas(Integer id, Integer idUsuario, String tarea,
			Date fechaCreaccion, Date fechalimite, String prioridad, Boolean ternminada ) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.tarea = tarea;
		this.fechaCreaccion = fechaCreaccion;
		this.fechalimite = fechalimite;
		this.prioridad = prioridad;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getTarea() {
		return tarea;
	}
	public void setTarea(String tarea) {
		this.tarea = tarea;
	}
	public Date getFechaCreaccion() {
		return fechaCreaccion;
	}
	public void setFechaCreaccion(Date fechaCreaccion) {
		this.fechaCreaccion = fechaCreaccion;
	}
	public Date getFechalimite() {
		return fechalimite;
	}
	public void setFechalimite(Date fechalimite) {
		this.fechalimite = fechalimite;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public Boolean getTernminada() {
		return ternminada;
	}
	public void setTernminada(Boolean ternminada) {
		this.ternminada = ternminada;
	}

}


// sintaxis de un constructor :
//  
//clase estatica ( para clases de utilidades) el constructor suele ser privado por logica
//no necesita  del objeto en si. nombreclase.metodo.
//
//instanciar es crear un objeto a partir de una clase
//Usuario.usuario= new Usuario()
//TipoClase.Nombrevariable= new contructor(con variables necesarias) 
//
// usamos this. para llamar a un constructor diferente de la misma clase.


// el array sirve para agrupar objetos. en contra tiene el ordenado que no es facil.
// el array por definicion tiene longitud fija.

// vector (caca no usar) !!!

//Lista son tipo de datos ordenados ( up y get...) tiene diversos metodos. 
//se acede a el como si fuera un array pero con sus propios metodos como el orden, 
//una lista no tienen porque estar definida desde el principio con una longitud fija
//elegir una lista u otra depende de como sean los datos ya que depende 

//Mapas son como listas pero a cada dato se le asocia un identificador. 
// solo se pueden poner objetos no primitivos es decir int no y integer si. 



// por convenio todo mayuscula: constantes
// todo minuscula paquetes
// Clases con la primera en mayusculas 
// atributos/ variables solo con 
//mayuscula cuando se empieza una palabra por comodidad ejemplo:  idUsuario


