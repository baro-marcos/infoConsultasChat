package com.info.consultasChat.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.info.consultasChat.entidades.Saldo;

/**
 * @author marcos
 */

public interface SaldoRepositorio extends JpaRepository<Saldo, Long> {
	
	@Query(value = "select s from Saldo s where usuario.idUsuario = ?1")
	public Saldo obtenerSaldoUsuario(Long idUsuario);

}
