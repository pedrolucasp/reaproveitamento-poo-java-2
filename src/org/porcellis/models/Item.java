package org.porcellis.models;

import java.math.BigDecimal;

public class Item {
	private Integer quantidade;
	private BigDecimal total;

	private Pedido pedido;
	private Produto produto;

	public Item(Produto produto, Integer quantidade) {
		this.quantidade = quantidade;
		this.produto = produto;

		this.total = calculaTotal();
	}

	public Item(Integer quantidade, Pedido pedido, Produto produto) {
		this.pedido = pedido;
		this.produto = produto;
		this.quantidade = quantidade;

		this.total = calculaTotal();
	}

	public BigDecimal calculaTotal() {
		return produto.getPrecoDeVenda()
			.multiply(BigDecimal.valueOf(quantidade));
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
