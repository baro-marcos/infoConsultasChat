package com.info.consultasChat.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.info.consultasChat.entidades.Usuario;
import com.info.consultasChat.servicios.UsuarioServicio;

/**
 * @author marcos
 */

@Controller
public class UsuarioControlador {
	
	@Autowired
	private UsuarioServicio usuarioServicio;
	
	@RequestMapping("/usuariosRol")
	public ModelAndView usuariosPorRol(ModelAndView mv, @Param("rol") Long rol) {
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		mv.addObject("titulo", "Usuarios por Rol");
		mv.addObject("tituloh1", "Usuarios por Rol");
				
		if (rol == null) {
			listaUsuarios = usuarioServicio.listarTodosUsuarios();
		} else {
			listaUsuarios = usuarioServicio.listarUsuariosPorRol(rol);
		}
		
		mv.addObject("todosUsuarios", listaUsuarios);
		mv.addObject("rol", rol);
		
		mv.setViewName("usuariosRol");
		return mv;
		
	}

}
