package com.info.consultasChat.repositorios;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.info.consultasChat.entidades.HistorialPreguntas;

/**
 * @author marcos
 */

public interface HistorialPreguntasRepositorio extends JpaRepository<HistorialPreguntas, Long> {

	@Query(value = "select h.idPregunta, p.pregunta, count(1) from HistorialPreguntas h, Pregunta p "
			+ "where h.idPregunta = p.idPregunta group by p.pregunta")
	public List<Object[]> obtenerCantidadPreguntas();
	
	@Query(value = "select h from HistorialPreguntas h "
			+ " where exists (select p from Pregunta p where p.usuario.idUsuario = h.usuario.idUsuario "
			+ "and p.idPregunta = h.idPregunta) and h.usuario.idRol = 1")
	public List<HistorialPreguntas> obtenerPreguntasRespuestasAdmin();
	
	@Query(value = "select h from HistorialPreguntas h "
			+ " where h.fechaHist between ?1 and ?2")
	public List<HistorialPreguntas> obtenerPreguntasRespuestasRangoFechas(Date fechaDesde, Date fechaHasta);

}
