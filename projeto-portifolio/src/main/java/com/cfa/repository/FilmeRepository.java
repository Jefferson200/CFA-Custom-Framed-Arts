package com.cfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cfa.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
