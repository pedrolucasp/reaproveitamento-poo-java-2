package org.porcellis.models;

public class EnderecoDeEntrega extends Endereco {

	public EnderecoDeEntrega(String tipoDeLogradouro, String logradouro, String
			numero, String bairro, String cep, Estado estado, Cidade cidade) {

        super(tipoDeLogradouro, logradouro, numero, bairro, cep, estado, cidade);
    }
}
