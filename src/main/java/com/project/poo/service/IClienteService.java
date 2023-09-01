package com.project.poo.service;

import com.project.poo.model.Cliente;

import java.util.List;

// Interfaz para las operaciones con los clientes
public interface IClienteService {
    Cliente crearCliente(Cliente cliente);
    List<Cliente> obtenerClientes();
    Cliente obtenerClienteId(Long id);
    void borrarCliente(Long id);
}
