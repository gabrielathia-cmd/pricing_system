package com.docescarol.pricing_system.repositorys;

import com.docescarol.pricing_system.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Produto, Long>{

}
