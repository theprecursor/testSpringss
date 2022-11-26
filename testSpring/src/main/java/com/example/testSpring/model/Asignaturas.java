package com.example.testSpring.model;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="asignaturas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Asignaturas{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "asignaturas_id")
	private int id;
	
	@Column(name = "asignaturas_nombre")
	private String nombre;
	
	@Column(name = "asignaturas_total")
	private int TotalAlumnos;
	
	@ManyToMany
	private List<Alumnos> AlumnosMatriculados;

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

	public int getTotalAlumnos() {
		return TotalAlumnos;
	}

	public void setTotalAlumnos(int totalAlumnos) {
		TotalAlumnos = totalAlumnos;
	}

	public List<Alumnos> getAlumnosMatriculados() {
		return AlumnosMatriculados;
	}

	public void setAlumnosMatriculados(List<Alumnos> alumnosMatriculados) {
		AlumnosMatriculados = alumnosMatriculados;
	}
	
	
	
	

}
