package org.porcellis.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nomeCompleto;
	private String email;
	private String telefone;

	private List<Endereco> enderecos;
	private List<Pedido> pedidos;

	public Cliente(String nomeCompleto, String email, String telefone) {
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.telefone = telefone;
		this.enderecos = new ArrayList<Endereco>();
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

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
}
