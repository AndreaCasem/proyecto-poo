package com.project.poo.service;

import com.project.poo.model.Cliente;
import com.project.poo.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepository;

    // Crear nuevo cliente y guardar en la base de datos
    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Listar todos los clientes creados
    @Override
    public List<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    // Obtener cliente por su id
    @Override
    public Cliente obtenerClienteId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    // Borrar cliente
    @Override
    public void borrarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
