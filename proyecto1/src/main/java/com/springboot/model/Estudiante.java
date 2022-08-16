package com.springboot.model;

public class Estudiante {

	/*Atributos*/
 private String nombre;
 private String apellido;
 private String correo;
 

/*Constructores*/
public Estudiante() {
	super();
}


public Estudiante(String nombre, String apellido, String correo) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
}

/*Metodos get y set*/

public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


 
 
}
