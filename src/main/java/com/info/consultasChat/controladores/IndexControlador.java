package com.info.consultasChat.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author marcos
 */

@Controller
public class IndexControlador {
		
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mv) {

		//Pasamos datos a la vista
		mv.addObject("titulo", "Info Consultas Chat");
		mv.addObject("tituloh1", "Info Consultas Chat");
		
		//Seteamos el nombre de la vista
		mv.setViewName("index");
		return mv;
		
	}

}
