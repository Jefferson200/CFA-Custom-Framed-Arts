package com.example.cfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cfa.model.Artista;
import com.example.cfa.repository.ArtistaRepository;

@Service
public class ArtistaService {
    
    @Autowired
    private ArtistaRepository artistaRepository;
    
    public List<Artista> listarArtistas() {
        return artistaRepository.findAll();
    }
    
    public Artista buscarArtistaPorId(Long id) {
        return artistaRepository.findById(id).orElse(null);
    }
    
    public Artista salvarArtista(Artista artista) {
        return artistaRepository.save(artista);
    }
    
    public void excluirArtista(Long id) {
        artistaRepository.deleteById(id);
    }}