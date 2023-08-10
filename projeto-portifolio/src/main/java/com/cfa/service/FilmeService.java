package com.cfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfa.model.Filme;
import com.cfa.repository.FilmeRepository;

@Service
public class FilmeService {
    
    @Autowired
    private FilmeRepository filmeRepository;
    
    public List<Filme> listarFilmes() {
        return filmeRepository.findAll();
    }
    
    public Filme buscarFilmePorId(Long id) {
        return filmeRepository.findById(id).orElse(null);
    }
    
    public Filme salvarFilme(Filme filme) {
        return filmeRepository.save(filme);
    }
    
    public void excluirFilme(Long id) {
        filmeRepository.deleteById(id);
    }
}
