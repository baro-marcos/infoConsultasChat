package com.info.consultasChat.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.info.consultasChat.mapeadores.PreguntasMapeador;
import com.info.consultasChat.servicios.PreguntasRespuestasServicio;

/**
 * @author marcos
 */

@Controller
public class PreguntasNuncaRealizadasControlador {

	@Autowired
	private PreguntasRespuestasServicio preguntasRespuestasServicio;

	@RequestMapping("/preguntasNuncaRealizadas")
	public ModelAndView preguntasNoRealizadas(ModelAndView mv) {

		List<PreguntasMapeador> listaPreguntasNuncaRealizadas = new ArrayList<PreguntasMapeador>();

		mv.addObject("titulo", "Preguntas nunca realizadas");
		mv.addObject("tituloh1", "Preguntas nunca realizadas");

		listaPreguntasNuncaRealizadas = preguntasRespuestasServicio.listarPreguntasNoRealizadas();

		mv.addObject("listaPreguntasNuncaRealizadas", listaPreguntasNuncaRealizadas);

		mv.setViewName("preguntasNuncaRealizadas");
		return mv;

	}

}
