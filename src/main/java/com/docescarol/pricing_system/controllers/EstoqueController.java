package com.docescarol.pricing_system.controllers;


import com.docescarol.pricing_system.dtos.categoria.*;
import com.docescarol.pricing_system.entities.Produto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.docescarol.pricing_system.services.EstoqueService;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

// Atributos

    private EstoqueService service;

// DI - Contructor

    @Autowired
    public EstoqueController(EstoqueService service) {
        this.service = service;
    }

// Methods

    @PostMapping("/criar_produto")
    public ResponseEntity<ProductResponse> criarProduto(@RequestBody ProductRequest request) {
         ProductResponse response = service.createProduct(request);
         return ResponseEntity.ok(response);
    }

    @GetMapping("/listar-categoria-produtos")

    public ResponseEntity<List<Produto>> listarProdutos(){
        List<Produto> produtos = service.listProducts();
        if (produtos == null) {return null;}
        return ResponseEntity.ok(produtos);
    }
}
