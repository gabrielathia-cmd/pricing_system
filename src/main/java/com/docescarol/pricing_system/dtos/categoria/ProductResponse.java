package com.docescarol.pricing_system.dtos.categoria;

import lombok.Getter;
import lombok.Setter;

public class ProductResponse {

// Attributes

    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String descricao;

// Constructor

    public ProductResponse(long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public ProductResponse(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
