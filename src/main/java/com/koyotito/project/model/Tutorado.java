package com.koyotito.project.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Tutorado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTutorado;
	private String pseudonimo;
	private Integer nivel;
	private Integer puntos;
	
	@OneToOne(mappedBy = "tutorado")
	private Usuario usuario;
	
	@ManyToOne
	private Tutor tutor;
	
	@OneToMany(mappedBy = "tutorado")
	private List<RelUsuarioGrupo> relUsuarioGrupos;
	
	@OneToMany(mappedBy = "tutorado")
	private List<Visitas> visitas;
	
	@OneToMany(mappedBy = "tutorado")
	private List<Likes> likes;
	
	public Tutorado() {

	}
	public Tutorado(Integer idTutorado, String pseudonimo, Integer nivel, Integer puntos, Usuario usuario, Tutor tutor,
			List<RelUsuarioGrupo> relUsuarioGrupos, List<Visitas> visitas, List<Likes> likes) {
		super();
		this.idTutorado = idTutorado;
		this.pseudonimo = pseudonimo;
		this.nivel = nivel;
		this.puntos = puntos;
		this.usuario = usuario;
		this.tutor = tutor;
		this.relUsuarioGrupos = relUsuarioGrupos;
		this.visitas = visitas;
		this.likes = likes;
	}
	@Override
	public String toString() {
		return "Tutorado [idTutorado=" + idTutorado + ", pseudonimo=" + pseudonimo + ", nivel=" + nivel + ", puntos="
				+ puntos + ", usuario=" + usuario + ", tutor=" + tutor + ", relUsuarioGrupos=" + relUsuarioGrupos
				+ ", visitas=" + visitas + ", likes=" + likes + "]";
	}
	public Integer getIdTutorado() {
		return idTutorado;
	}
	public void setIdTutorado(Integer idTutorado) {
		this.idTutorado = idTutorado;
	}
	public String getPseudonimo() {
		return pseudonimo;
	}
	public void setPseudonimo(String pseudonimo) {
		this.pseudonimo = pseudonimo;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Tutor getTutor() {
		return tutor;
	}
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	public List<RelUsuarioGrupo> getRelUsuarioGrupos() {
		return relUsuarioGrupos;
	}
	public void setRelUsuarioGrupos(List<RelUsuarioGrupo> relUsuarioGrupos) {
		this.relUsuarioGrupos = relUsuarioGrupos;
	}
	public List<Visitas> getVisitas() {
		return visitas;
	}
	public void setVisitas(List<Visitas> visitas) {
		this.visitas = visitas;
	}
	public List<Likes> getLikes() {
		return likes;
	}
	public void setLikes(List<Likes> likes) {
		this.likes = likes;
	}		
}
