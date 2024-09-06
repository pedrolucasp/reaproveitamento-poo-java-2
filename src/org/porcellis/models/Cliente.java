package org.porcellis.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nomeCompleto;
	private String email;
	private String telefone;

	private EnderecoDeCobranca cobranca;
	private EnderecoDeEntrega entrega;
	private List<Pedido> pedidos;

	public Cliente(String nomeCompleto, String email, String telefone,
			EnderecoDeCobranca cobranca, EnderecoDeEntrega entrega) {

		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.telefone = telefone;
		this.cobranca = cobranca;
		this.entrega = entrega;

		this.pedidos = new ArrayList<Pedido>();
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public EnderecoDeCobranca getCobranca() {
		return cobranca;
	}

	public void setCobranca(EnderecoDeCobranca cobranca) {
		this.cobranca = cobranca;
	}

	public EnderecoDeEntrega getEntrega() {
		return entrega;
	}

	public void setEntrega(EnderecoDeEntrega entrega) {
		this.entrega = entrega;
	}
}
