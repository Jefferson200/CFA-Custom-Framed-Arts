package com.cfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cfa.model.Manga;
import com.cfa.service.MangaService;

@RestController
@RequestMapping("/mangas")
public class MangaController {
    
    @Autowired
    private MangaService mangaService;
    
    @GetMapping
    public ResponseEntity<List<Manga>> listarMangas() {
        List<Manga> mangas = mangaService.listarMangas();
        return ResponseEntity.ok(mangas);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Manga> buscarMangaPorId(@PathVariable Long id) {
        Manga manga = mangaService.buscarMangaPorId(id);
        if (manga != null) {
            return ResponseEntity.ok(manga);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping
    public ResponseEntity<Manga> salvarManga(@RequestBody Manga manga) {
        Manga mangaSalvo = mangaService.salvarManga(manga);
        return ResponseEntity.status(HttpStatus.CREATED).body(mangaSalvo);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirManga(@PathVariable Long id) {
        mangaService.excluirManga(id);
        return ResponseEntity.noContent().build();
    }
}
