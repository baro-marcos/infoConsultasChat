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
public class AltasPreguntasAdminControlador {

	@Autowired
	private PreguntasRespuestasServicio preguntasRespuestasServicio;

	@RequestMapping("/altasPreguntasAdmin")
	public ModelAndView altasPreguntasAdmin(ModelAndView mv) {

		List<PreguntasMapeador> listaAltaPregUsuariosAdmin = new ArrayList<PreguntasMapeador>();

		mv.addObject("titulo", "Alta de preguntas por usuarios Admin");
		mv.addObject("tituloh1", "Alta de preguntas por usuarios Admin");

		listaAltaPregUsuariosAdmin = preguntasRespuestasServicio.listarAltaPreguntasUsuariosAdmin();

		mv.addObject("listaAltaPregUsuariosAdmin", listaAltaPregUsuariosAdmin);

		mv.setViewName("altasPreguntasAdmin");
		return mv;

	}

}
