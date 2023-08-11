package com.info.consultasChat.entidades;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * @author marcos
 */

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDUsuario")
	private Long idUsuario;

	@Column(name = "Usuario", nullable = false, length = 10)
	private String usuario;
	
	@Column(name = "pass", nullable = false, length = 10)
	private String pass;

	@Column(name = "Nombre", nullable = false, length = 15)
	private String nombre;

	@Column(name = "Apellido", nullable = false, length = 15)
	private String apellido;

	@Column(name = "Telefono", nullable = true, length = 25)
	private String telefono;

	@Column(name = "Genero", nullable = false, length = 1)
	private String genero;

	@Column(name = "Pais", nullable = false, length = 15)
	private String pais;

	@Column(name = "FechaAlta", nullable = false)
	private Date fechaAlta;
	
	@Column(name = "IDRol", nullable = false, length = 5)
	private Long idRol;

	@OneToMany(mappedBy = "usuario")
    private List<Rol> roles;
	
	@OneToMany(mappedBy = "usuario")
    private List<Pregunta> preguntas;
	
	@OneToOne(mappedBy = "usuario")
    private Saldo saldo;
	
	@OneToMany(mappedBy = "usuario")
    private List<HistorialPreguntas> historialPreguntas;

	public Usuario() {
		super();
	}

	public Usuario(Long idUsuario, String usuario, String pass, String nombre, String apellido, String telefono,
			String genero, String pais, Date fechaAlta, Long idRol, List<Rol> roles, List<Pregunta> preguntas,
			Saldo saldo, List<HistorialPreguntas> historialPreguntas) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.pass = pass;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.genero = genero;
		this.pais = pais;
		this.fechaAlta = fechaAlta;
		this.idRol = idRol;
		this.roles = roles;
		this.preguntas = preguntas;
		this.saldo = saldo;
		this.historialPreguntas = historialPreguntas;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> rol) {
		this.roles = rol;
	}

	public List<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public Saldo getSaldo() {
		return saldo;
	}

	public void setSaldo(Saldo saldo) {
		this.saldo = saldo;
	}

	public List<HistorialPreguntas> getHistorialPreguntas() {
		return historialPreguntas;
	}

	public void setHistorialPreguntas(List<HistorialPreguntas> historialPreguntas) {
		this.historialPreguntas = historialPreguntas;
	}

}
