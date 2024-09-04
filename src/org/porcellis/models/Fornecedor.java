package org.porcellis.models;

import java.util.List;
import java.util.ArrayList;

public class Fornecedor {
    private String cnpj;
    private String razaoSocial;
    private String email;
    private String telefone;
	private List<Produto> produtos;

    public Fornecedor(String cnpj, String razaoSocial, String email, String telefone) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.telefone = telefone;
		this.produtos = new ArrayList<Produto>();
    }

	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}

	public List<Produto> getProdutos() {
		return this.produtos;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
