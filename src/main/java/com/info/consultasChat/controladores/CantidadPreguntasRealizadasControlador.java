package com.info.consultasChat.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.info.consultasChat.mapeadores.CantidadPreguntasRealizadasMapeador;
import com.info.consultasChat.servicios.PreguntasRespuestasServicio;

/**
 * @author marcos
 */

@Controller
public class CantidadPreguntasRealizadasControlador {

	@Autowired
	private PreguntasRespuestasServicio preguntasRespuestasServicio;

	@RequestMapping("/cantidadPreguntasRealizadas")
	public ModelAndView cantidadPreguntas(ModelAndView mv) {

		List<CantidadPreguntasRealizadasMapeador> listaContadorPreguntas = new ArrayList<CantidadPreguntasRealizadasMapeador>();

		mv.addObject("titulo", "Contador de preguntas realizadas");
		mv.addObject("tituloh1", "Contador de preguntas realizadas");

		listaContadorPreguntas = preguntasRespuestasServicio.listarCantidadPreguntas();

		mv.addObject("listaContadorPreguntas", listaContadorPreguntas);

		mv.setViewName("cantidadPreguntasRealizadas");
		return mv;

	}

}
