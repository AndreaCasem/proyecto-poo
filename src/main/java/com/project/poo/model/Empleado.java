package com.project.poo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@DiscriminatorValue("empleados")
public class Empleado extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cargo;

    @Override
    public String obtenerInformacion()
    {
        return "Empleado: " + nombre + " " + apellido + ", Cargo: " + cargo;
    }
}
