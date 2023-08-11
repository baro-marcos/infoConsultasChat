package com.info.consultasChat.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.info.consultasChat.entidades.Pregunta;

/**
 * @author marcos
 */

public interface PreguntaRepositorio extends JpaRepository<Pregunta, Long> {
	
	@Query(value = "select p from Pregunta p where usuario.idRol = 1")
	public List<Pregunta> obtenerPreguntasUsariosAdmin();
	
	@Query(value = "select p from Pregunta p where p.idPregunta "
			+ " not in (select h.idPregunta from HistorialPreguntas h)")
	public List<Pregunta> obtenerPreguntasNuncaRealizadas();

}
