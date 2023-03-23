package com.koyotito.project.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Tutor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTutor; 
	private Integer numTutorados;
	@OneToOne(mappedBy = "tutor")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "tutor")
	private List<Tutorado> tutorados;
	
	
	public Tutor() {
		
	}
	
	public Tutor(Integer idTutor, Integer numTutorados, Usuario usuario, List<Tutorado> tutorados) {
		super();
		this.idTutor = idTutor;
		this.numTutorados = numTutorados;
		this.usuario = usuario;
		this.tutorados = tutorados;
	}

	@Override
	public String toString() {
		return "Tutor [idTutor=" + idTutor + ", numTutorados=" + numTutorados
				+ ", usuario=" + usuario + ", tutorados=" + tutorados + "]";
	}

	public Integer getIdTutor() {
		return idTutor;
	}
	public void setIdTutor(Integer idTutor) {
		this.idTutor = idTutor;
	}
	public Integer getNumTutorados() {
		return numTutorados;
	}
	public void setNumTutorados(Integer numTutorados) {
		this.numTutorados = numTutorados;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Tutorado> getTutorados() {
		return tutorados;
	}
	public void setTutorados(List<Tutorado> tutorados) {
		this.tutorados = tutorados;
	}
	
	
		
}
	