package com.project.poo.controller;

import com.project.poo.model.Cliente;
import com.project.poo.model.Empleado;
import com.project.poo.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmpleadoController {
    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleados")
    public String mostrarClientes(Model model) {
        List<Empleado> empleados = empleadoService.obtenerEmpleados();
        model.addAttribute("empleados", empleados);
        return "empleados";
    }

    @GetMapping("/empleados/crear")
    public String mostrarFormularioCrearEmpleado() {
        return "crearEmpleado";
    }

    @PostMapping("/empleados/crear")
    public String crearEmpleado(@ModelAttribute Empleado empleado) {
        empleadoService.crearEmpleado(empleado);
        return "redirect:/empleados";
    }

    @GetMapping("/empleados/borrar/{id}")
    public String borrarEmpleado(@PathVariable Long id) {
        empleadoService.borrarEmpleado(id);
        return "redirect:/empleados";
    }
}
