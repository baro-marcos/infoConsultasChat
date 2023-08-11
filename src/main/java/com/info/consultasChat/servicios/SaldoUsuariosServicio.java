package com.info.consultasChat.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.consultasChat.entidades.Saldo;
import com.info.consultasChat.mapeadores.PreguntasMapeador;
import com.info.consultasChat.repositorios.SaldoRepositorio;

/**
 * @author marcos
 */

@Service
public class SaldoUsuariosServicio {
	
	@Autowired
	private SaldoRepositorio saldoRepositorio;
	
	public List<PreguntasMapeador> listarSaldosUsuarios() {
		
		List<PreguntasMapeador> listaSaldos = new ArrayList<PreguntasMapeador>();
		
		List<Saldo> listaSaldoUsuarios = saldoRepositorio.findAll();
		
		for (Saldo datosSaldo : listaSaldoUsuarios) {

			PreguntasMapeador datosSaldoAMapear = new PreguntasMapeador();

			datosSaldoAMapear.setIdUsuario(datosSaldo.getIdUsuario());
			datosSaldoAMapear.setNombreUsuario(datosSaldo.getUsuario().getNombre());
			datosSaldoAMapear.setApellidoUsuario(datosSaldo.getUsuario().getApellido());
			datosSaldoAMapear.setImporte(datosSaldo.getDeudaTotal());
			datosSaldoAMapear.setMoneda(datosSaldo.getMoneda().getMoneda());

			listaSaldos.add(datosSaldoAMapear);

		}
		
		return listaSaldos;
		
	}
	
	public List<PreguntasMapeador> listarSaldoUsuario(Long idUsuario) {
		
		List<PreguntasMapeador> listaSaldos = new ArrayList<PreguntasMapeador>();
		
		Saldo saldoUsuario = saldoRepositorio.obtenerSaldoUsuario(idUsuario);

		if (saldoUsuario != null) {
			
			PreguntasMapeador datosSaldoAMapear = new PreguntasMapeador();
			
			datosSaldoAMapear.setIdUsuario(saldoUsuario.getIdUsuario());
			datosSaldoAMapear.setNombreUsuario(saldoUsuario.getUsuario().getNombre());
			datosSaldoAMapear.setApellidoUsuario(saldoUsuario.getUsuario().getApellido());
			datosSaldoAMapear.setImporte(saldoUsuario.getDeudaTotal());
			datosSaldoAMapear.setMoneda(saldoUsuario.getMoneda().getMoneda());
			
			//La vista espera una lista de PreguntasMapeador
			listaSaldos.add(datosSaldoAMapear);
			
		}
		
		return listaSaldos;
		
	}

}
