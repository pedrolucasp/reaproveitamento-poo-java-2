package org.porcellis.models;

public class ClientePessoaJuridica extends Cliente {
	private String cnpj;

	public ClientePessoaJuridica(String nomeCompleto, String email, String telefone,
			EnderecoDeCobranca cobranca, EnderecoDeEntrega entrega, String cnpj) {

		super(nomeCompleto, email, telefone, cobranca, entrega);

		this.cnpj = cnpj;
	}
}
