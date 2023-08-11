package com.info.consultasChat.entidades;

import java.util.Date;

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
@Table(name = "historialpreguntas")
public class HistorialPreguntas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDHistorialPreg")
	private Long idHistorialPreg;

	@Column(name = "IDUsuario", nullable = false, length = 5)
	private Long idUsuario;

	@Column(name = "IDPregunta", nullable = false, length = 5)
	private Long idPregunta;

	@Column(name = "IDRespuesta", nullable = false, length = 5)
	private Long idRespuesta;

	@Column(name = "FechaHist", nullable = false)
	private Date fechaHist;

	@ManyToOne
	@JoinColumn(name = "idPregunta")
	private Pregunta pregunta;
	
	@ManyToOne
	@JoinColumn(name = "idRespuesta")
	private Respuesta respuesta;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public HistorialPreguntas() {
		super();
	}

	public HistorialPreguntas(Long idHistorialPreg, Long idUsuario, Long idPregunta, Long idRespuesta, Date fechaHist,
			Pregunta pregunta, Respuesta respuesta, Usuario usuario) {
		super();
		this.idHistorialPreg = idHistorialPreg;
		this.idUsuario = idUsuario;
		this.idPregunta = idPregunta;
		this.idRespuesta = idRespuesta;
		this.fechaHist = fechaHist;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.usuario = usuario;
	}

	public Long getIdHistorialPreg() {
		return idHistorialPreg;
	}

	public void setIdHistorialPreg(Long idHistorialPreg) {
		this.idHistorialPreg = idHistorialPreg;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Long idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Long getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(Long idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public Date getFechaHist() {
		return fechaHist;
	}

	public void setFechaHist(Date fechaHist) {
		this.fechaHist = fechaHist;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public Respuesta getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Respuesta respuesta) {
		this.respuesta = respuesta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
