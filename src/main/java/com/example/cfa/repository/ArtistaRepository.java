package com.example.cfa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cfa.model.Artista;

@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Long> {

}
