package com.cfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cfa.model.Pedido;
import com.cfa.service.PedidoService;

@RestController
@RequestMapping("/Pedidos")
public class PedidoController {
    
    @Autowired
    private PedidoService PedidoService;
    
    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos() {
        List<Pedido> pedidos = PedidoService.listarPedidos();
        return ResponseEntity.ok(pedidos);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedidoPorId(@PathVariable Long id) {
        Pedido pedido = PedidoService.buscarPedidoPorId(id);
        if (pedido != null) {
            return ResponseEntity.ok(pedido);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping
    public ResponseEntity<Pedido> salvarPedido(@RequestBody Pedido pedido) {
        Pedido pedidoSalvo = PedidoService.salvarPedido(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoSalvo);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPedido(@PathVariable Long id) {
        PedidoService.excluirPedido(id);
        return ResponseEntity.noContent().build();
    }
}
