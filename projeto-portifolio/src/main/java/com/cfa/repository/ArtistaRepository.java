package com.cfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cfa.model.Artista;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {

}
