package com.example.cfa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.cfa.model.Artista;
import com.example.cfa.service.ArtistaService;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {
    
    @Autowired
    private ArtistaService artistaService;
    
    @GetMapping
    public ResponseEntity<List<Artista>> listarArtistas() {
    	// arrumar
        // List<Artista> artistas = artistaService.listarArtistas();
        return ResponseEntity.ok(new ArrayList<Artista>());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Artista> buscarArtistaPorId(@PathVariable Long id) {
        Artista artista = artistaService.buscarArtistaPorId(id);
        if (artista != null) {
            return ResponseEntity.ok(artista);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping
    public ResponseEntity<Artista> salvarArtista(@RequestBody Artista artista) {
        Artista artistaSalvo = artistaService.salvarArtista(artista);
        return ResponseEntity.status(HttpStatus.CREATED).body(artistaSalvo);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirArtista(@PathVariable Long id) {
        artistaService.excluirArtista(id);
        return ResponseEntity.noContent().build();
    }
}
