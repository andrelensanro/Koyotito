package com.koyotito.project.model;

import java.util.List;

import jakarta.persistence.OneToMany;

public class TipoUsuario {
	private Integer idTipoUsuario;
	private String tipoUsuario;
	
	@OneToMany(mappedBy = "tipoUsuario")
	private List<Usuario> usuario;

	
	public TipoUsuario() {
	}
	
	
	
	public TipoUsuario(Integer idTipoUsuario, String tipoUsuario, List<Usuario> usuario) {
		super();
		this.idTipoUsuario = idTipoUsuario;
		this.tipoUsuario = tipoUsuario;
		this.usuario = usuario;
	}



	@Override
	public String toString() {
		return "TipoUsuario [idTipoUsuario=" + idTipoUsuario + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public List<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	
}
