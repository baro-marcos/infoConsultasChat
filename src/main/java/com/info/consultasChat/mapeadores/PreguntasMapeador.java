package com.info.consultasChat.mapeadores;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author marcos
 */

public class PreguntasMapeador {

	private Long idPregunta;
	private Long idUsuarioAlta;
	private String pregunta;
	private Date fechaPregunta;
	
	private String usuario;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String telefonoUsuario;
	private Long idRol;
	private String rolUsuario;
	private String pais;
	
	private Long idUsuario;
	private BigDecimal importe;
	private String moneda;
	
	private String respuesta;
	
	private Date fechaPreguntaHist;
	
	public PreguntasMapeador() {
		super();
	}

	public PreguntasMapeador(Long idPregunta, Long idUsuarioAlta, String pregunta, Date fechaPregunta,
			String nombreUsuario, String apellidoUsuario, String telefonoUsuario, Long idRol, String rolUsuario,
			Long idUsuario, BigDecimal importe, String moneda, String respuesta, Date fechaPreguntaHist, String usuario, 
			String pais) {
		super();
		this.idPregunta = idPregunta;
		this.idUsuarioAlta = idUsuarioAlta;
		this.pregunta = pregunta;
		this.fechaPregunta = fechaPregunta;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.idRol = idRol;
		this.rolUsuario = rolUsuario;
		this.idUsuario = idUsuario;
		this.importe = importe;
		this.moneda = moneda;
		this.respuesta = respuesta;
		this.fechaPreguntaHist = fechaPreguntaHist;
		this.usuario = usuario;
		this.pais = pais;
	}

	public Long getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Long idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Long getIdUsuarioAlta() {
		return idUsuarioAlta;
	}

	public void setIdUsuarioAlta(Long idUsuarioAlta) {
		this.idUsuarioAlta = idUsuarioAlta;
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

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getRolUsuario() {
		return rolUsuario;
	}

	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Date getFechaPreguntaHist() {
		return fechaPreguntaHist;
	}

	public void setFechaPreguntaHist(Date fechaPreguntaHist) {
		this.fechaPreguntaHist = fechaPreguntaHist;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
