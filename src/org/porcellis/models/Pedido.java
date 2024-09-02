package org.porcellis.models;

import java.math.BigDecimal;
import java.util.Date;

public class Pedido {
	private String numero;
	private Date data;
	private BigDecimal total;

	private Cliente cliente;

	public Pedido(String numero, Date data, BigDecimal total, Cliente cliente) {
		this.numero = numero;
		this.data = data;
		this.total = total;

		this.cliente = cliente;
	}
}
