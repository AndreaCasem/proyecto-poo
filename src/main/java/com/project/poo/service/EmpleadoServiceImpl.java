package com.project.poo.service;

import com.project.poo.model.Empleado;
import com.project.poo.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
    @Autowired
    private IEmpleadoRepository empleadoRepository;

    // Crear nuevo empleado
    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    // Listar todos los empleados creados
    @Override
    public List<Empleado> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

    // Obtener empleado por su id
    @Override
    public Empleado obtenerEmpleadoId(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    // Borrar empleado
    @Override
    public void borrarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

}
