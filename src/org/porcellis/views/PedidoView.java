package org.porcellis.views;

import org.porcellis.models.Pedido;
import org.porcellis.utils.Formatador;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class PedidoView {
	public String mostrarDetalhesPedido(Pedido pedido) {
		return String.format(
			"Pedido: %s\nData: %s\nCliente: %s\nEntrega: %s\nCobrança: %s\n\tItems\n\n%s\n\nTotal: %s",
			pedido.getNumero(),
			pedido.getData(),
			pedido.getCliente().getNomeCompleto(),
			pedido.getCliente().getEntrega(),
			pedido.getCliente().getCobranca(),
			descriminacaoPedido(pedido),
			Formatador.formatarMoeda(pedido.getTotal().doubleValue())
		);
	}

	public String descriminacaoPedido(Pedido pedido) {
		// Usa map para transformar cada item em uma string
		return pedido.getItens().stream().map(item -> {
			return String.format(
				"\tProduto: %s\n\tQuantidade: %s\n\tPreço: %s\n\tTotal: %s\n",
				item.getProduto().getNome(),
				item.getQuantidade(),
				Formatador.formatarMoeda(item.getProduto().getPrecoDeVenda().doubleValue()),
				Formatador.formatarMoeda(item.getTotal().doubleValue())
			);
		}).reduce("", (acc, item) -> acc + item + "\n");
	}

	// Mostra total de vendas de uma lista de pedidos
	public String mostraRelatorioPedidos(List<Pedido> pedidos) {
		return String.format(
			"Total de vendas: %s",
			Formatador.formatarMoeda(
				pedidos.stream()
					.map(Pedido::getTotal)
					.reduce(BigDecimal.ZERO, BigDecimal::add)
					.doubleValue()
			)
		);
	}
}
