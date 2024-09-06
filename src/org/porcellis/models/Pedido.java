package org.porcellis.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import org.porcellis.models.Cliente;
import org.porcellis.models.Item;

import java.time.LocalDate;
import java.util.UUID;

public class Pedido {
	private String numero;
	private LocalDate data;
	private BigDecimal total;

	private Cliente cliente;
	private List<Item> itens;

	public Pedido(String numero, LocalDate data, Cliente cliente) {
		this.numero = numero;
		this.data = data;

		this.cliente = cliente;

		this.total = new BigDecimal(0);
		this.itens = new ArrayList<Item>();
	}

	public void adicionaItens(List<Item> itens) {
		this.itens = itens;

		itens.forEach(item -> item.setPedido(this));
		// XXX: Tem side-effects, talvez uma função pura seja melhor?
		calculaTotal();

		// XXX: Mais side-effects
		itens
			.forEach(item -> item.getProduto().atualizaEstoque(item.getQuantidade()));
	}

	public boolean entre(LocalDate inicio, LocalDate fim) {
		return !data.isBefore(inicio) && !data.isAfter(fim);
	}

	private void calculaTotal() {
		this.total = itens.stream()
			.map(Item::getTotal)
			.reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	public String getNumero() {
		return numero;
	}

	public LocalDate getData() {
		return data;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
