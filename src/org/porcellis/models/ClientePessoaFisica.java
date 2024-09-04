package org.porcellis.models;

public class ClientePessoaFisica extends Cliente {
	private String cpf;

	public ClientePessoaFisica(String nomeCompleto, String email, String telefone, String cpf) {
		super(nomeCompleto, email, telefone);

		this.cpf = cpf;
	}
}
