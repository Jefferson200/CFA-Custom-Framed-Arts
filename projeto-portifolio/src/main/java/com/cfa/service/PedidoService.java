package com.cfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfa.model.Pedido;
import com.cfa.repository.PedidoRepository;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
    
    public Pedido buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
    
    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    
    public void excluirPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
