package com.koyotito.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class RelUsuarioGrupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRelacion;
	
	@ManyToOne
	private Grupo grupo;
	@ManyToOne
	private Tutorado tutorado;
	
	public RelUsuarioGrupo() {
	
	}
	public RelUsuarioGrupo(Integer idRelacion, Grupo grupo, Tutorado tutorado) {
		super();
		this.idRelacion = idRelacion;
		this.grupo = grupo;
		this.tutorado = tutorado;
	}
	@Override
	public String toString() {
		return "RelUsuarioGrupo [idRelacion=" + idRelacion + ", grupo=" + grupo + ", tutorado=" + tutorado + "]";
	}
	public Integer getIdRelacion() {
		return idRelacion;
	}
	public void setIdRelacion(Integer idRelacion) {
		this.idRelacion = idRelacion;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public Tutorado getTutorado() {
		return tutorado;
	}
	public void setTutorado(Tutorado tutorado) {
		this.tutorado = tutorado;
	}	
}
