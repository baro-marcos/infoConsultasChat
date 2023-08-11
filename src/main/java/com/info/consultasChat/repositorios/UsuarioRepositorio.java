package com.info.consultasChat.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.info.consultasChat.entidades.Usuario;

/**
 * @author marcos
 */

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	
	@Query(value = "select u from Usuario u where u.idRol = ?1")
	public List<Usuario> obtenerUsuariosRol(Long rol);
	
	@Query(value = "select u from Usuario u where saldo.deudaTotal = 0.00")
	public List<Usuario> obtenerUsuariosSinDeuda();

}
