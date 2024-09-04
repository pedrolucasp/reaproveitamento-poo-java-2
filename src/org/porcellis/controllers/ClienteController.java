package org.porcellis.controllers;

import org.porcellis.models.ClientePessoaFisica;
import org.porcellis.models.ClientePessoaJuridica;
import org.porcellis.models.Cliente;

public class ClienteController {
	public <T extends Cliente> T criarCliente(String nome, String email, String telefone,
			String documento, Class<T> tipoCliente) {

		if (tipoCliente == ClientePessoaFisica.class) {
			return tipoCliente.cast(
				new ClientePessoaFisica(
					nome,
					email,
					telefone,
					documento
				)
			);
		} else if (tipoCliente == ClientePessoaJuridica.class) {
			return tipoCliente.cast(
				new ClientePessoaJuridica(
					nome,
					email,
					telefone,
					documento
				)
			);
		} else {
			throw new IllegalArgumentException("Tipo de cliente inválido: " + tipoCliente);
		}
	}
}
