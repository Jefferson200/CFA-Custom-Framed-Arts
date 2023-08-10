package com.cfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfa.model.Produto;
import com.cfa.model.QuadroA3Info;
import com.cfa.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscarProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    public QuadroA3Info getQuadroA3Info() {
        // Lógica para obter as informações do quadro A3
        String titulo = "Título do Quadro A3";
        String diretor = "Diretor do Quadro A3";
        String genero = "Gênero do Quadro A3";
        int anoLancamento = 2023;
        String sinopse = "Sinopse do Quadro A3";

        return new QuadroA3Info(titulo, diretor, genero, anoLancamento, sinopse);
    }
}
