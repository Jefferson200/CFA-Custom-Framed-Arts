package com.cfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfa.model.Cliente;
import com.cfa.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
    
    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
    
    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    
    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
