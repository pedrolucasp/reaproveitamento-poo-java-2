package org.porcellis.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String sku;
	private String nome;
	private String descricao;
	private Integer estoque;
	private BigDecimal precoDeCusto;
	private BigDecimal precoDeVenda;

	private Fornecedor fornecedor;
	private List<Fornecimento> fornecimentos;

	public Produto(String sku, String nome, String descricao, Integer estoque,
			BigDecimal precoDeCusto, BigDecimal precoDeVenda, Fornecedor
			fornecedor) {

		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoDeCusto = precoDeCusto;
		this.precoDeVenda = precoDeVenda;
		this.fornecedor = fornecedor;
		this.fornecimentos = new ArrayList<>();
	}

	public void adicionaForncimento(Fornecimento fornecimento) {
		this.fornecimentos.add(fornecimento);
	}

	public String getSku() {
		return sku;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public BigDecimal getPrecoDeCusto() {
		return precoDeCusto;
	}

	public BigDecimal getPrecoDeVenda() {
		return precoDeVenda;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public List<Fornecimento> getFornecimentos() {
		return fornecimentos;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public void setPrecoDeCusto(BigDecimal precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}

	public void setPrecoDeVenda(BigDecimal precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}
