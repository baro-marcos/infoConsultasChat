package com.info.consultasChat.controladores;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.info.consultasChat.mapeadores.PreguntasMapeador;
import com.info.consultasChat.servicios.PreguntasRespuestasServicio;

/**
 * @author marcos
 */

@Controller
public class PreguntasUsuariosRangoFechasControlador {

	@Autowired
	private PreguntasRespuestasServicio preguntasRespuestasServicio;

	@RequestMapping("/preguntasUsuariosRangoFechas")
	public ModelAndView preguntasUsuariosRangoFechas(ModelAndView mv, 
			@Param("fechaDesde") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaDesde, 
			@Param("fechaHasta") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fechaHasta) {

		List<PreguntasMapeador> listaPreguntasRangoFechas = new ArrayList<PreguntasMapeador>();

		mv.addObject("titulo", "Preguntas por rango de fechas");
		mv.addObject("tituloh1", "Preguntas por rango de fechas");

		if (fechaDesde != null && fechaHasta != null) {
			listaPreguntasRangoFechas = preguntasRespuestasServicio.listarPreguntasRangoFechas(fechaDesde, fechaHasta);
		}

		mv.addObject("listaPreguntasRangoFechas", listaPreguntasRangoFechas);
		mv.addObject("fechaDesde", fechaDesde);
		mv.addObject("fechaHasta", fechaHasta);

		mv.setViewName("preguntasUsuariosRangoFechas");
		return mv;

	}

}
