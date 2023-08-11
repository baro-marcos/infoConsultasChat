package com.info.consultasChat.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author marcos
 */

@Entity
@Table(name = "rol")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDRol")
	private Long idRol;
	
	@Column(name = "NombreRol", nullable = false, length = 10)
	private String nombreRol;
	
	@ManyToOne
	@JoinColumn(name = "idRol")
    private Usuario usuario;
	
	public Rol() {
		super();
	}

	public Rol(Long idRol, String nombreRol, Usuario usuario) {
		super();
		this.idRol = idRol;
		this.nombreRol = nombreRol;
		this.usuario = usuario;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
