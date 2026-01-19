package com.docescarol.pricing_system.services;

import com.docescarol.pricing_system.dtos.categoria.*;
import com.docescarol.pricing_system.entities.Produto;
import com.docescarol.pricing_system.repositorys.EstoqueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

//Class Atributes

    private EstoqueRepository repo;

//DI - Constructor

    @Autowired
    public EstoqueService(EstoqueRepository repo) {
        this.repo = repo;
    }

//DataBase Methods

    private Produto createOrUpdateProdutoRepository(Produto produto){
        return repo.save(produto);
    }

    private Produto getProdutobyId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    private List<Produto> getProdutosbyNome(String nome) {
        return repo.findByNome(nome);
    }

    private List<Produto> getProdutosbyPreco(Double preco) {
        return repo.findByPreco(preco);
    }

    private List<Produto> listProductsDataBase() {
        return repo.findAll();
    }

    private List<Produto> listProductsGraterThan(Double preco) {
        return repo.findByPrecoGreaterThan(preco);
    }

    private List<Produto> listProductsLessThan(Double preco) {
        return repo.findByPrecoGreaterThan(preco);
    }

// Callable Methods

    public ProductResponse createProduct(ProductRequest request) {
         Produto produto = new Produto();
         produto.setNome(request.getNome());
         produto.setPreco(request.getPreco());
         if(request.getDescricao() != null) {
             produto.setDescricao(request.getDescricao());
             Produto save = createOrUpdateProdutoRepository(produto);
             return new ProductResponse(save.getId(), save.getNome(), save.getDescricao());
         } else {
             Produto save = createOrUpdateProdutoRepository(produto);
             return new ProductResponse(save.getId(), save.getNome());
         }
    }

    public List<Produto> listProducts() {
        return repo.findAll();
    }

}
