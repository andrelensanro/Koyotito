package com.koyotito.project.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idGrupo;
	private String nombreGrupo;
	private Date fechaCreacion;

	@ManyToOne
	private Profesor profesor;
	@OneToMany(mappedBy = "grupo")
	private List<DenunciaGrupo> denunciaGrupos;
	@OneToMany(mappedBy = "grupo")
	private List<RelUsuarioGrupo> relUsuarioGrupos;
	@OneToMany(mappedBy = "grupo")
	private List<RelGrupoClase> relGrupoClases;
	
	public Grupo() {

	}

	public Grupo(Integer idGrupo, String nombreGrupo, Date fechaCreacion, Profesor profesor,
			List<DenunciaGrupo> denunciaGrupos, List<RelUsuarioGrupo> relUsuarioGrupos,
			List<RelGrupoClase> relGrupoClases) {
		super();
		this.idGrupo = idGrupo;
		this.nombreGrupo = nombreGrupo;
		this.fechaCreacion = fechaCreacion;
		this.profesor = profesor;
		this.denunciaGrupos = denunciaGrupos;
		this.relUsuarioGrupos = relUsuarioGrupos;
		this.relGrupoClases = relGrupoClases;
	}

	@Override
	public String toString() {
		return "Grupo [idGrupo=" + idGrupo + ", nombreGrupo=" + nombreGrupo + ", fechaCreacion=" + fechaCreacion
				+ ", profesor=" + profesor + ", denunciaGrupos=" + denunciaGrupos + ", relUsuarioGrupos="
				+ relUsuarioGrupos + ", relGrupoClases=" + relGrupoClases + "]";
	}

	public Integer getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public List<DenunciaGrupo> getDenunciaGrupos() {
		return denunciaGrupos;
	}

	public void setDenunciaGrupos(List<DenunciaGrupo> denunciaGrupos) {
		this.denunciaGrupos = denunciaGrupos;
	}

	public List<RelUsuarioGrupo> getRelUsuarioGrupos() {
		return relUsuarioGrupos;
	}

	public void setRelUsuarioGrupos(List<RelUsuarioGrupo> relUsuarioGrupos) {
		this.relUsuarioGrupos = relUsuarioGrupos;
	}

	public List<RelGrupoClase> getRelGrupoClases() {
		return relGrupoClases;
	}

	public void setRelGrupoClases(List<RelGrupoClase> relGrupoClases) {
		this.relGrupoClases = relGrupoClases;
	}
	
}
