package org.porcellis.models;

import java.math.BigDecimal;

public class Item {
	private Integer quantidade;
	private BigDecimal total;

	private Pedido pedido;
	private Produto produto;

	public Item(Integer quantidade, BigDecimal total, Pedido pedido, Produto produto) {
		this.quantidade = quantidade;
		this.total = total;
		this.pedido = pedido;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
