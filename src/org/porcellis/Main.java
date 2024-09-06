package org.porcellis;

import org.porcellis.models.*;
import org.porcellis.controllers.*;
import org.porcellis.views.*;
import org.porcellis.exceptions.*;
import org.porcellis.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;

public class Main {
	public static void main(String[] args) {
		PedidoView pedidoView = new PedidoView();
		ClienteController clienteController = new ClienteController();
		ProdutoController produtoController = new ProdutoController();
		PedidoController pedidoController = new PedidoController(pedidoView);

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

		List<Item> pedido1Items = new ArrayList<Item>();
		pedido1Items.add(new Item(camisetaMetallica, 15));
		pedido1Items.add(new Item(camisetaJudasPriest, 5));

		Pedido pedido1 = pedidoController.registraPedido(
			pessoaFisica,
			pedido1Items,
			LocalDate.now()
		);

		pedidoController.mostraPedido(pedido1);

		System.out.println("Lista de Pedidos");

		pedidoController.mostraPedidos();

		List<Item> pedido2Items = new ArrayList<Item>();
		pedido2Items.add(new Item(camisetaMetallica, 10));
		pedido2Items.add(new Item(camisetaJudasPriest, 10));

		Pedido pedido2 = pedidoController.registraPedido(
			pessoaJuridica,
			pedido2Items,
			LocalDate.now().minusMonths(1)
		);

		List<Item> pedido3Items = new ArrayList<Item>();
		pedido3Items.add(new Item(camisetaMetallica, 2));
		pedido3Items.add(new Item(camisetaJudasPriest, 4));

		Pedido pedido3 = pedidoController.registraPedido(
			pessoaJuridica,
			pedido3Items,
			LocalDate.now().minusMonths(3)
		);

		List<Item> pedido4Items = new ArrayList<Item>();
		pedido4Items.add(new Item(camisetaMetallica, 2));
		pedido4Items.add(new Item(camisetaJudasPriest, 4));

		Pedido pedido4 = pedidoController.registraPedido(
			pessoaFisica,
			pedido4Items,
			LocalDate.now().minusMonths(8)
		);

		System.out.println("\nPedidos do intervalo de 6 meses");
		pedidoController.relatorioPedidosIntervalo(
			LocalDate.now().minusMonths(6),
			LocalDate.now()
		);

		System.out.println("\nPedidos do último mes");
		pedidoController.relatorioPedidosIntervalo(
			LocalDate.now().minusMonths(1),
			LocalDate.now()
		);

		System.out.println("Exemplo de uso do FaltaEnderecoDeEntregaException");

		ClientePessoaFisica pessoaFisica2 = clienteController.criarCliente(
			"Kirk Hammet",
			"kirk@hammet.com",
			"53984233222",
			"123.456.789-00",
			null,
			cobranca,
			ClientePessoaFisica.class
		);

		List<Item> pedido5Items = new ArrayList<Item>();
		pedido5Items.add(new Item(camisetaMetallica, 2));

		try {
			Pedido pedido5 = pedidoController.registraPedido(
				pessoaFisica2,
				pedido5Items,
				LocalDate.now().minusMonths(8)
			);
		} catch (FaltaEnderecoDeEntregaException e) {
			System.out.println("FaltaEnderecoDeEntregaException lançada");
		}


		System.out.println("\nExemplo com uma data aleatoria");

		long timestamp = 1723987846070L;
		Instant instant = Instant.ofEpochMilli(timestamp);

		String montevideo = Formatador.formatarDataParaFuso(instant, "America/Montevideo");
		String chicago = Formatador.formatarDataParaFuso(instant, "America/Chicago");

		System.out.println("America/Montevideo: " + montevideo);
		System.out.println("America/Chicago: " + chicago);
	}
}


