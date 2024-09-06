package org.porcellis.controllers;

import org.porcellis.models.Fornecedor;
import org.porcellis.models.Produto;
import java.util.UUID;
import java.math.BigDecimal;

public class ProdutoController {

	public Produto criarProduto(String nome, String descricao, int estoque,
			double precoCusto, double precoVenda, Fornecedor fornecedor) {

		return new Produto(
			// Generate a random sku string
			"SKU-" + UUID.randomUUID(),
			nome,
			descricao,
			estoque,
			new BigDecimal(precoCusto),
			new BigDecimal(precoVenda),
			fornecedor
		);
	}
}
