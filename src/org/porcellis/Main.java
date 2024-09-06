package org.porcellis;

import org.porcellis.models.*;
import org.porcellis.controllers.*;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		ClienteController clienteController = new ClienteController();
		ProdutoController produtoController = new ProdutoController();


		EnderecoDeEntrega entrega = new EnderecoDeEntrega(
			"Rua",
			"Rua dos Bobos",
			"12",
			"Centro",
			"90000-000",
			Estado.RS,
			Cidade.PELOTAS
		);

		EnderecoDeCobranca cobranca = new EnderecoDeCobranca(
			"Rua",
			"Rua dos Otarios",
			"1123",
			"Bonfim",
			"90000-000",
			Estado.RS,
			Cidade.PORTO_ALEGRE
		);

		ClientePessoaFisica pessoaFisica = clienteController.criarCliente(
			"João da Silva",
			"james@hetfield.com",
			"53984233222",
			"123.456.789-00",
			entrega,
			cobranca,
			ClientePessoaFisica.class
		);

		ClientePessoaJuridica pessoaJuridica = clienteController.criarCliente(
			"Metallica LTDA",
			"hi@metallica.com",
			"53984233222",
			"12.345.678/0001-00",
			entrega,
			cobranca,
			ClientePessoaJuridica.class
		);

		Fornecedor fornecedor = new Fornecedor(
			"12.341.555/0001-01", "Camisetaria", "oi@camisetaria.com", "53949199192"
		);

		Produto camisetaMetallica = produtoController.criarProduto(
			"Camiseta Metallica",
			"Camiseta preta com logo do Metallica",
			50,
			49.90,
			59.90,
			fornecedor
		);

		Produto camisetaJudasPriest = produtoController.criarProduto(
			"Camiseta Judas Priest",
			"Camiseta preta com logo do Judas Priest",
			40,
			49.90,
			59.90,
			fornecedor
		);

		System.out.println("Produtos do fornecedor: " + fornecedor.getProdutos());
	}
}


