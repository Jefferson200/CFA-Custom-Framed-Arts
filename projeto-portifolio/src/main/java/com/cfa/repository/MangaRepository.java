package com.cfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cfa.model.Manga;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {

}
