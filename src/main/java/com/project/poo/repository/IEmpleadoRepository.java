package com.project.poo.repository;

import com.project.poo.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {
}
