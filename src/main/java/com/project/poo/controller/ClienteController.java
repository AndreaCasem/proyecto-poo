package com.project.poo.controller;

import com.project.poo.model.Cliente;
import com.project.poo.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public String mostrarClientes(Model model) {
        List<Cliente> clientes = clienteService.obtenerClientes();
        model.addAttribute("clientes", clientes);
        return "clientes";
    }

    @GetMapping("/clientes/crear")
    public String mostrarFormularioCrearCliente() {
        return "crearCliente";
    }

    @PostMapping("/clientes/crear")
    public String crearCliente(@ModelAttribute Cliente cliente) {
        clienteService.crearCliente(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/clientes/borrar/{id}")
    public String borrarCliente(@PathVariable Long id) {
        clienteService.borrarCliente(id);
        return "redirect:/clientes";
    }

}
