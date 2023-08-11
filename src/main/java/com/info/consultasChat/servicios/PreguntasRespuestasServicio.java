package com.info.consultasChat.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.consultasChat.entidades.HistorialPreguntas;
import com.info.consultasChat.entidades.Pregunta;
import com.info.consultasChat.mapeadores.CantidadPreguntasRealizadasMapeador;
import com.info.consultasChat.mapeadores.PreguntasMapeador;
import com.info.consultasChat.repositorios.HistorialPreguntasRepositorio;
import com.info.consultasChat.repositorios.PreguntaRepositorio;

/**
 * @author marcos
 */

@Service
public class PreguntasRespuestasServicio {

	@Autowired
	private HistorialPreguntasRepositorio historialPreguntasRepositorio;
	
	@Autowired
	private PreguntaRepositorio preguntaRepositorio;

	public List<CantidadPreguntasRealizadasMapeador> listarCantidadPreguntas() {

		List<CantidadPreguntasRealizadasMapeador> listaPreguntas = new ArrayList<CantidadPreguntasRealizadasMapeador>();

		List<Object[]> listaContadorPreguntas = historialPreguntasRepositorio.obtenerCantidadPreguntas();

		for (Object[] datosPreguntaCount : listaContadorPreguntas) {

			CantidadPreguntasRealizadasMapeador datosPregunta = new CantidadPreguntasRealizadasMapeador();

			datosPregunta.setId((Long) datosPreguntaCount[0]);
			datosPregunta.setPregunta((String) datosPreguntaCount[1]);
			datosPregunta.setCantidad((Long) datosPreguntaCount[2]);

			listaPreguntas.add(datosPregunta);

		}

		return listaPreguntas;

	}
	
	public List<PreguntasMapeador> listarAltaPreguntasUsuariosAdmin() {
		
		List<PreguntasMapeador> listaPreguntasAltaAdmin = new ArrayList<PreguntasMapeador>();
		
		List<Pregunta> listaAMapear = preguntaRepositorio.obtenerPreguntasUsariosAdmin();
		
		for (Pregunta dato : listaAMapear) {
			
			PreguntasMapeador datosPreguntaAMapear = new PreguntasMapeador();
			
			datosPreguntaAMapear.setNombreUsuario(dato.getUsuario().getNombre());
			datosPreguntaAMapear.setApellidoUsuario(dato.getUsuario().getApellido());
			datosPreguntaAMapear.setTelefonoUsuario(dato.getUsuario().getTelefono());
			datosPreguntaAMapear.setIdRol(dato.getUsuario().getIdRol());
			datosPreguntaAMapear.setPregunta(dato.getPregunta());
			
			listaPreguntasAltaAdmin.add(datosPreguntaAMapear);
			
		}
		
		return listaPreguntasAltaAdmin;
		
	}
	
	public List<PreguntasMapeador> listarPreguntaRespuestaUsuariosAdmin() {
		
		List<PreguntasMapeador> listaPreguntasAltaAdmin = new ArrayList<PreguntasMapeador>();
		
		List<HistorialPreguntas> listaAMapear = historialPreguntasRepositorio.obtenerPreguntasRespuestasAdmin();
		
		for (HistorialPreguntas dato : listaAMapear) {
			
			PreguntasMapeador datosPreguntaAMapear = new PreguntasMapeador();
			
			datosPreguntaAMapear.setNombreUsuario(dato.getUsuario().getNombre());
			datosPreguntaAMapear.setApellidoUsuario(dato.getUsuario().getApellido());
			datosPreguntaAMapear.setTelefonoUsuario(dato.getUsuario().getTelefono());
			datosPreguntaAMapear.setIdRol(dato.getUsuario().getIdRol());
			datosPreguntaAMapear.setPregunta(dato.getPregunta().getPregunta());
			datosPreguntaAMapear.setRespuesta(dato.getRespuesta().getRespuesta());
			
			listaPreguntasAltaAdmin.add(datosPreguntaAMapear);
			
		}
		
		return listaPreguntasAltaAdmin;
		
	}
	
	public List<PreguntasMapeador> listarPreguntasRangoFechas(Date fechaDesde, Date fechaHasta) {
		
		List<PreguntasMapeador> listaPreguntasRangoFechas = new ArrayList<PreguntasMapeador>();
		
		List<HistorialPreguntas> listaAMapear = historialPreguntasRepositorio.obtenerPreguntasRespuestasRangoFechas(fechaDesde, fechaHasta);
		
		for (HistorialPreguntas dato : listaAMapear) {
			
			PreguntasMapeador datosPreguntaAMapear = new PreguntasMapeador();
			
			datosPreguntaAMapear.setUsuario(dato.getUsuario().getUsuario());
			datosPreguntaAMapear.setNombreUsuario(dato.getUsuario().getNombre());
			datosPreguntaAMapear.setPregunta(dato.getPregunta().getPregunta());
			datosPreguntaAMapear.setRespuesta(dato.getRespuesta().getRespuesta());
			datosPreguntaAMapear.setFechaPreguntaHist(dato.getFechaHist());
			
			listaPreguntasRangoFechas.add(datosPreguntaAMapear);
			
		}
		
		return listaPreguntasRangoFechas;
		
	}
	
	public List<PreguntasMapeador> listarPreguntasNoRealizadas() {
		
		List<PreguntasMapeador> listaPreguntasNoRealizadas = new ArrayList<PreguntasMapeador>();
		
		List<Pregunta> listaAMapear = preguntaRepositorio.obtenerPreguntasNuncaRealizadas();
		
		for (Pregunta dato : listaAMapear) {
			
			PreguntasMapeador datosPreguntaAMapear = new PreguntasMapeador();
			
			datosPreguntaAMapear.setIdPregunta(dato.getIdPregunta());
			datosPreguntaAMapear.setPregunta(dato.getPregunta());
			datosPreguntaAMapear.setFechaPregunta(dato.getFechaPregunta());
						
			listaPreguntasNoRealizadas.add(datosPreguntaAMapear);
			
		}
		
		return listaPreguntasNoRealizadas;
		
	}

}
