package com.docescarol.pricing_system.services;

import com.docescarol.pricing_system.entities.Produto;
import com.docescarol.pricing_system.repositorys.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService {

//Class Atributes

    private EstoqueRepository estoqueRepository;

//DI - Constructor
    @Autowired
    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

//DataBase Methods

    public Produto createOrUpdateProdutoRepository(Produto produto){
        return estoqueRepository.save(produto);
    }

}
