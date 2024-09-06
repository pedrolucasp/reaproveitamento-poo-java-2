package org.porcellis.controllers;

import org.porcellis.models.ClientePessoaFisica;
import org.porcellis.models.ClientePessoaJuridica;
import org.porcellis.models.EnderecoDeCobranca;
import org.porcellis.models.EnderecoDeEntrega;
import org.porcellis.models.Cliente;

public class ClienteController {
	public <T extends Cliente> T criarCliente(String nome, String email, String telefone,
			String documento, EnderecoDeEntrega entrega, EnderecoDeCobranca cobranca,
			Class<T> tipoCliente) {

		if (tipoCliente == ClientePessoaFisica.class) {
			return tipoCliente.cast(
				new ClientePessoaFisica(
					nome,
					email,
					telefone,
					cobranca,
					entrega,
					documento
				)
			);
		} else if (tipoCliente == ClientePessoaJuridica.class) {
			return tipoCliente.cast(
				new ClientePessoaJuridica(
					nome,
					email,
					telefone,
					cobranca,
					entrega,
					documento
				)
			);
		} else {
			throw new IllegalArgumentException("Tipo de cliente inválido: " + tipoCliente);
		}
	}
}
