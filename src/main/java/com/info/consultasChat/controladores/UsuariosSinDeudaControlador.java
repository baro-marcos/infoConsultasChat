package com.info.consultasChat.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.info.consultasChat.mapeadores.PreguntasMapeador;
import com.info.consultasChat.servicios.UsuarioServicio;

/**
 * @author marcos
 */

@Controller
public class UsuariosSinDeudaControlador {

	@Autowired
	private UsuarioServicio usuarioServicio;

	@RequestMapping("/usuariosSinDeuda")
	public ModelAndView usuariosSinDeuda(ModelAndView mv) {

		List<PreguntasMapeador> listaUsuariosSinDeuda = new ArrayList<PreguntasMapeador>();

		mv.addObject("titulo", "Usuarios sin saldo deudor");
		mv.addObject("tituloh1", "Usuarios sin saldo deudor");

		listaUsuariosSinDeuda = usuarioServicio.listarUsuariosSinDeuda();

		mv.addObject("listaUsuariosSinDeuda", listaUsuariosSinDeuda);

		mv.setViewName("usuariosSinDeuda");
		return mv;

	}

}
