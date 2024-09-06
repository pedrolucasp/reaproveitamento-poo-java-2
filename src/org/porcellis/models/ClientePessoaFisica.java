package org.porcellis.models;

public class ClientePessoaFisica extends Cliente {
	private String cpf;

	public ClientePessoaFisica(String nomeCompleto, String email, String telefone,
			EnderecoDeCobranca cobranca, EnderecoDeEntrega entrega, String cpf) {

		super(nomeCompleto, email, telefone, cobranca, entrega);

		this.cpf = cpf;
	}
}
