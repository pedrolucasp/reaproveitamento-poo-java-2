package org.porcellis.models;

import java.math.BigDecimal;
import java.util.Date;

public class Fornecimento {
    private Date data;
    private int quantidade;
    private BigDecimal total;
    private Produto produto;
    private Fornecedor fornecedor;

    // Construtor
    public Fornecimento(Date data, int quantidade, BigDecimal total, Produto produto, Fornecedor fornecedor) {
        this.data = data;
        this.quantidade = quantidade;
        this.total = total;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

}
