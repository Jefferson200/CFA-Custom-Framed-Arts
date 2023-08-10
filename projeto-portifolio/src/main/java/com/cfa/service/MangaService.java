package com.cfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfa.model.Manga;
import com.cfa.repository.MangaRepository;

@Service
public class MangaService {
    
    @Autowired
    private MangaRepository mangaRepository;
    
    public List<Manga> listarMangas() {
        return mangaRepository.findAll();
    }
    
    public Manga buscarMangaPorId(Long id) {
        return mangaRepository.findById(id).orElse(null);
    }
    
    public Manga salvarManga(Manga manga) {
        return mangaRepository.save(manga);
    }
    
    public void excluirManga(Long id) {
        mangaRepository.deleteById(id);
    }
}
