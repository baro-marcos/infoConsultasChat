package com.info.consultasChat.entidades;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author marcos
 */

@Entity
@Table(name = "pregunta")
public class Pregunta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPregunta")
	private Long idPregunta;

	@Column(name = "IDUsuario", nullable = false, length = 5)
	private Long idUsuario;

	@Column(name = "Pregunta", nullable = false, length = 100)
	private String pregunta;

	@Column(name = "FechaPregunta", nullable = false)
	private Date fechaPregunta;

	@OneToMany(mappedBy = "pregunta")
	private List<HistorialPreguntas> historialPreguntas;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
    private Usuario usuario;

	public Pregunta() {
		super();
	}

	public Pregunta(Long idPregunta, Long idUsuario, String pregunta, Date fechaPregunta,
			List<HistorialPreguntas> historialPreguntas, Usuario usuario) {
		super();
		this.idPregunta = idPregunta;
		this.idUsuario = idUsuario;
		this.pregunta = pregunta;
		this.fechaPregunta = fechaPregunta;
		this.historialPreguntas = historialPreguntas;
		this.usuario = usuario;
	}

	public Long getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Long idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public Date getFechaPregunta() {
		return fechaPregunta;
	}

	public void setFechaPregunta(Date fechaPregunta) {
		this.fechaPregunta = fechaPregunta;
	}

	public List<HistorialPreguntas> getHistorialPreguntas() {
		return historialPreguntas;
	}

	public void setHistorialPreguntas(List<HistorialPreguntas> historialPreguntas) {
		this.historialPreguntas = historialPreguntas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
