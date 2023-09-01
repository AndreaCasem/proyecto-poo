package com.project.poo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass // Mapeando como superclase
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String correo;


    public abstract String obtenerInformacion();
}
