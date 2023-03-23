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
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	private String nombre;
	private String apellido;
	private String apellido2;
	private String correo;
	private String password;

	
	private Integer idTipoUsuario;
	
	@OneToMany(mappedBy = "usuario")
	private List<ControlUsuario> controlUsuario;
	
	@OneToOne
	private Administrador administrador;
	
	@OneToOne
	private Tutor tutor;

	@OneToOne
	private Tutorado tutorado;
	
	@ManyToOne
	private TipoUsuario tipoUsuario;
	
	@OneToOne
	private Profesor profesor;
	

	public Usuario() {
		super();
	}

	

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", apellido2="
				+ apellido2 + ", correo=" + correo + ", password=" + password + ", idTipoUsuario=" + idTipoUsuario
				+ "]";
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
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
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public List<ControlUsuario> getControlUsuario() {
		return controlUsuario;
	}

	public void setControlUsuario(List<ControlUsuario> controlUsuario) {
		this.controlUsuario = controlUsuario;
	}
	
	
	
	
}
