package org.porcellis.controllers;

import org.porcellis.views.PedidoView;
import org.porcellis.models.Pedido;
import org.porcellis.models.Cliente;
import org.porcellis.models.Item;
import org.porcellis.exceptions.FaltaEnderecoDeEntregaException;

import java.util.UUID;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class PedidoController {
	private PedidoView pedidoView;
	private List<Pedido> pedidos;

	public PedidoController(PedidoView pedidoView) {
		this.pedidoView = pedidoView;
		this.pedidos = new ArrayList<Pedido>();
	}

	public Pedido registraPedido(Cliente cliente, List<Item> itens, LocalDate data) throws FaltaEnderecoDeEntregaException {
		if (cliente.getEntrega() == null) {
			throw new FaltaEnderecoDeEntregaException();
		}

		Pedido pedido = new Pedido(UUID.randomUUID().toString(), data, cliente);

		// Adiciona os itens no pedido
		pedido.adicionaItens(itens);

		// Adiciona na lista interna do controller
		pedidos.add(pedido);

		return pedido;
	}

	public void mostraPedidos() {
		pedidos.forEach(pedido -> {
			System.out.println(pedidoView.mostrarDetalhesPedido(pedido));
		});
	}

	public void mostraPedido(Pedido pedido) {
		System.out.println("\n");
		System.out.println(pedidoView.mostrarDetalhesPedido(pedido));
	}

	public void relatorioPedidosIntervalo(LocalDate inicio, LocalDate fim) {
		List<Pedido> pedidosNoIntervalo = pedidos.stream()
			.filter(pedido -> pedido.entre(inicio, fim))
			.toList();

		System.out.println(pedidosNoIntervalo.size());

		System.out.println(pedidoView.mostraRelatorioPedidos(pedidosNoIntervalo));
	}
}
