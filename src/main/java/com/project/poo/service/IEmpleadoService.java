package com.project.poo.service;

import com.project.poo.model.Empleado;

import java.util.List;

// Interfaz para las operaciones con los empleados
public interface IEmpleadoService {
    Empleado crearEmpleado(Empleado empleado);
    List<Empleado> obtenerEmpleados();
    Empleado obtenerEmpleadoId(Long id);
    void borrarEmpleado(Long id);
}
