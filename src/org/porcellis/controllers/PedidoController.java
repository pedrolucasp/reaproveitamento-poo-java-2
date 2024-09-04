package org.porcellis.controllers;

import org.porcellis.views.PedidoView;
import org.porcellis.models.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoController {
	private PedidoView pedidoView;
	private List<Pedido> pedidos;

	public PedidoController(PedidoView pedidoView) {
		this.pedidoView = pedidoView;
		this.pedidos = new ArrayList<Pedido>();
	}

	public void registrarPedido() {
	}

	public void criarPedido() {

	}
}
