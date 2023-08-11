package com.info.consultasChat.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author marcos
 */

@Entity
@Table(name = "respuesta")
public class Respuesta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDRespuesta")
	private Long idRespuesta;
	
	@Column(name = "Respuesta", nullable = false, length = 150)
	private String respuesta;
		
	@OneToMany(mappedBy = "respuesta")
	private List<HistorialPreguntas> historialPreguntas;

	public Respuesta() {
		super();
	}

	public Respuesta(Long idRespuesta, String respuesta, List<HistorialPreguntas> historialPreguntas) {
		super();
		this.idRespuesta = idRespuesta;
		this.respuesta = respuesta;
		this.historialPreguntas = historialPreguntas;
	}

	public Long getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(Long idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public List<HistorialPreguntas> getHistorialPreguntas() {
		return historialPreguntas;
	}

	public void setHistorialPreguntas(List<HistorialPreguntas> historialPreguntas) {
		this.historialPreguntas = historialPreguntas;
	}

}
