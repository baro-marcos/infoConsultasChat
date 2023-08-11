package com.info.consultasChat.entidades;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * @author marcos
 */

@Entity
@Table(name = "saldo")
public class Saldo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDSaldo")
	private Long idSaldo;
	
	@Column(name = "DeudaTotal", nullable = false, columnDefinition = "decimal(10,2) default 0.00")
	private BigDecimal deudaTotal;
	
	@Column(name = "IDMoneda", nullable = false, length = 5)
	private Long idMoneda;
	
	@Column(name = "IDUsuario", nullable = false, length = 5)
	private Long idUsuario;
	
	@ManyToOne
	@JoinColumn(name = "idMoneda")
    private Moneda moneda;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
	private Usuario usuario;

	public Saldo() {
		super();
	}

	public Saldo(Long idSaldo, BigDecimal deudaTotal, Long idMoneda, Long idUsuario, Moneda moneda, Usuario usuario) {
		super();
		this.idSaldo = idSaldo;
		this.deudaTotal = deudaTotal;
		this.idMoneda = idMoneda;
		this.idUsuario = idUsuario;
		this.moneda = moneda;
		this.usuario = usuario;
	}

	public Long getIdSaldo() {
		return idSaldo;
	}

	public void setIdSaldo(Long idSaldo) {
		this.idSaldo = idSaldo;
	}

	public BigDecimal getDeudaTotal() {
		return deudaTotal;
	}

	public void setDeudaTotal(BigDecimal deudaTotal) {
		this.deudaTotal = deudaTotal;
	}

	public Long getIdMoneda() {
		return idMoneda;
	}

	public void setIdMoneda(Long idMoneda) {
		this.idMoneda = idMoneda;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
