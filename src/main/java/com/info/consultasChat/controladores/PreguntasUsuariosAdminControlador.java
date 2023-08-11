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
public class PreguntasUsuariosAdminControlador {

	@Autowired
	private PreguntasRespuestasServicio preguntasRespuestasServicio;

	@RequestMapping("/preguntasUsuariosAdmin")
	public ModelAndView preguntasAdmin(ModelAndView mv) {

		List<PreguntasMapeador> listaPreguntaRespuestaAdmin = new ArrayList<PreguntasMapeador>();

		mv.addObject("titulo", "Preguntas-Respuestas Admin");
		mv.addObject("tituloh1", "Preguntas-Respuestas Admin");

		listaPreguntaRespuestaAdmin = preguntasRespuestasServicio.listarPreguntaRespuestaUsuariosAdmin();

		mv.addObject("listaPreguntaRespuestaAdmin", listaPreguntaRespuestaAdmin);

		mv.setViewName("preguntasUsuariosAdmin");
		return mv;

	}

}
