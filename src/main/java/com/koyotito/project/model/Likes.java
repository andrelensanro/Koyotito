package com.koyotito.project.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Likes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLike;
	
	@ManyToOne
	private Clase clase;
	
	@ManyToOne
	private Tutorado tutorado;
	
	@ManyToOne 
	private Profesor profesor;

	public Likes() {
		
	}
	public Likes(Integer idLike, Clase clase, Tutorado tutorado, Profesor profesor) {
		super();
		this.idLike = idLike;
		this.clase = clase;
		this.tutorado = tutorado;
		this.profesor = profesor;
	}
	@Override
	public String toString() {
		return "Likes [idLike=" + idLike + ", clase=" + clase + ", tutorado=" + tutorado + ", profesor=" + profesor
				+ "]";
	}
	public Integer getIdLike() {
		return idLike;
	}
	public void setIdLike(Integer idLike) {
		this.idLike = idLike;
	}
	public Clase getClase() {
		return clase;
	}
	public void setClase(Clase clase) {
		this.clase = clase;
	}
	public Tutorado getTutorado() {
		return tutorado;
	}
	public void setTutorado(Tutorado tutorado) {
		this.tutorado = tutorado;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
}
