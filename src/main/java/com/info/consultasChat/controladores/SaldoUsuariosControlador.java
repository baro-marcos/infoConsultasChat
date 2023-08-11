package com.info.consultasChat.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.info.consultasChat.mapeadores.PreguntasMapeador;
import com.info.consultasChat.servicios.SaldoUsuariosServicio;

/**
 * @author marcos
 */

@Controller
public class SaldoUsuariosControlador {

	@Autowired
	private SaldoUsuariosServicio saldoUsuariosServicio;

	@RequestMapping("/saldoUsuarios")
	public ModelAndView saldoUsuarios(ModelAndView mv, @Param("idUsuario") Long idUsuario) {

		List<PreguntasMapeador> saldosUsuarios = new ArrayList<PreguntasMapeador>();

		mv.addObject("titulo", "Saldos Usuarios");
		mv.addObject("tituloh1", "Saldos Usuarios");

		if (idUsuario == null) {
			saldosUsuarios = saldoUsuariosServicio.listarSaldosUsuarios();
		} else {
			saldosUsuarios = saldoUsuariosServicio.listarSaldoUsuario(idUsuario);
		}

		mv.addObject("saldosUsuarios", saldosUsuarios);
		mv.addObject("idUsuario", idUsuario);

		mv.setViewName("saldoUsuarios");
		return mv;

	}

}
