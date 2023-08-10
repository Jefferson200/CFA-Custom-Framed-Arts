package com.cfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cfa.model.Filme;
import com.cfa.service.FilmeService;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    
    @Autowired
    private FilmeService filmeService;
    
    @GetMapping
    public ResponseEntity<List<Filme>> listarFilmes() {
        List<Filme> filmes = filmeService.listarFilmes();
        return ResponseEntity.ok(filmes);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarFilmePorId(@PathVariable Long id) {
        Filme filme = filmeService.buscarFilmePorId(id);
        if (filme != null) {
            return ResponseEntity.ok(filme);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping
    public ResponseEntity<Filme> salvarFilme(@RequestBody Filme filme) {
        Filme filmeSalvo = filmeService.salvarFilme(filme);
        return ResponseEntity.status(HttpStatus.CREATED).body(filmeSalvo);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirFilme(@PathVariable Long id) {
        filmeService.excluirFilme(id);
        return ResponseEntity.noContent().build();
    }
}
