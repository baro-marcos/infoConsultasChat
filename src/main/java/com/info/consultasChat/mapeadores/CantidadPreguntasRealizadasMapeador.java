package com.info.consultasChat.mapeadores;

/**
 * @author marcos
 */

public class CantidadPreguntasRealizadasMapeador {

	private Long id;
	private String pregunta;
	private Long cantidad;

	public CantidadPreguntasRealizadasMapeador() {
		super();
	}

	public CantidadPreguntasRealizadasMapeador(Long id, String pregunta, Long cantidad) {
		super();
		this.id = id;
		this.pregunta = pregunta;
		this.cantidad = cantidad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

}
