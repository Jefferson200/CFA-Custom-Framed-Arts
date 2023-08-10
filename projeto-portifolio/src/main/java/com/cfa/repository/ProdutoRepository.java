package com.cfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cfa.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
