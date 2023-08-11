package com.info.consultasChat.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.consultasChat.entidades.Usuario;
import com.info.consultasChat.mapeadores.PreguntasMapeador;
import com.info.consultasChat.repositorios.UsuarioRepositorio;

/**
 * @author marcos
 */

@Service
public class UsuarioServicio {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	public List<Usuario> listarTodosUsuarios() {
		return usuarioRepositorio.findAll();
	}
	
	public List<Usuario> listarUsuariosPorRol(Long rol) {
		return usuarioRepositorio.obtenerUsuariosRol(rol);
	}
	
	public List<PreguntasMapeador> listarUsuariosSinDeuda() {
		
		List<PreguntasMapeador> listaUsuariosSinDeuda = new ArrayList<PreguntasMapeador>();
		
		List<Usuario> listaAMapear = usuarioRepositorio.obtenerUsuariosSinDeuda();

		for (Usuario dato : listaAMapear) {
						
			PreguntasMapeador datosUsuariosAMapear = new PreguntasMapeador();
			
			datosUsuariosAMapear.setUsuario(dato.getUsuario());
			datosUsuariosAMapear.setNombreUsuario(dato.getNombre());
			datosUsuariosAMapear.setPais(dato.getPais());
			datosUsuariosAMapear.setIdRol(dato.getIdRol());
									
			listaUsuariosSinDeuda.add(datosUsuariosAMapear);
			
		}
		
		return listaUsuariosSinDeuda;
		
	}

}
