package org.porcellis.models;

public class ClientePessoaJuridica extends Cliente {
	private String cnpj;

	public ClientePessoaJuridica(String nomeCompleto, String email, String telefone, String cnpj) {
		super(nomeCompleto, email, telefone);

		this.cnpj = cnpj;
	}
}
