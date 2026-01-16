package com.docescarol.pricing_system.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CategoriaProdutos")
public class Produto {

// Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    @Column(name = "nome", nullable = false)
    private String nome;

    @Getter
    @Setter
    @Column(name = "descricao")
    private String descricao;

    @Getter
    @Setter
    @Column(name = "preco", nullable = false, scale = 2)
    private double preco;

// Constructors

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.descricao = null;
        this.preco = preco;
    }

    public Produto() {
        this.nome = null;
        this.descricao = null;
        this.preco = 0;
    }
}
