package org.porcellis.models;

public class EnderecoDeCobranca extends Endereco {

	public EnderecoDeCobranca(String tipoDeLogradouro, String logradouro, String
			numero, String bairro, String cep, Estado estado, Cidade cidade) {

        super(tipoDeLogradouro, logradouro, numero, bairro, cep, estado, cidade);
    }
}
