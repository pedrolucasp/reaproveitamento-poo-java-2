package org.porcellis.models;

public class Endereco {
	private String tipoDeLogradouro;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;

	private Estado estado;
	private Cidade cidade;

	public Endereco(String tipoDeLogradouro, String logradouro, String numero,
			String bairro, String cep, Estado estado, Cidade cidade) {
		this.tipoDeLogradouro = tipoDeLogradouro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;

		this.estado = estado;
		this.cidade = cidade;
	}

	public String getTipoDeLogradouro() {
		return tipoDeLogradouro;
	}

	public void setTipoDeLogradouro(String tipoDeLogradouro) {
		this.tipoDeLogradouro = tipoDeLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}

