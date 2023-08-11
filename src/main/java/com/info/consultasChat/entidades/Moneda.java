package com.info.consultasChat.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author marcos
 */

@Entity
@Table(name = "moneda")
public class Moneda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDMoneda")
	private Long idMoneda;

	@Column(name = "Moneda", nullable = false, length = 10)
	private String moneda;

	@OneToMany(mappedBy = "moneda")
	private List<Saldo> saldos;

	public Moneda() {
		super();
	}

	public Moneda(Long idMoneda, String moneda, List<Saldo> saldos) {
		super();
		this.idMoneda = idMoneda;
		this.moneda = moneda;
		this.saldos = saldos;
	}

	public Long getIdMoneda() {
		return idMoneda;
	}

	public void setIdMoneda(Long idMoneda) {
		this.idMoneda = idMoneda;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public List<Saldo> getSaldos() {
		return saldos;
	}

	public void setSaldos(List<Saldo> saldos) {
		this.saldos = saldos;
	}

}
