package com.example.testSpring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Malumnos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Alumnos {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "alumnos_id")
	private int id;
	
	@Column(name = "alumnos_nombre")
	private String nombre;
	
	
	@Column(name = "alumnos_dni")
	private String dni;
	
	@Column(name = "alumnos_edad")
	private int edad;

	
	@ManyToMany(cascade = CascadeType.REMOVE)
	private List<Asignaturas> AsignaturasMatriculadas;


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


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public List<Asignaturas> getAsignaturasMatriculadas() {
		return AsignaturasMatriculadas;
	}


	public void setAsignaturasMatriculadas(List<Asignaturas> asignaturasMatriculadas) {
		AsignaturasMatriculadas = asignaturasMatriculadas;
	}

	
	
}
