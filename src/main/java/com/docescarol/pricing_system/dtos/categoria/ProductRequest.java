package com.docescarol.pricing_system.dtos.categoria;

import lombok.Getter;
import lombok.Setter;

public class ProductRequest {

// Attributes

    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String descricao;
    @Getter
    @Setter
    private double preco;

// Constructor

    public ProductRequest(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public ProductRequest(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public ProductRequest() {}
}
