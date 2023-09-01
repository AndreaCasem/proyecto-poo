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
@DiscriminatorValue("clientes")
public class Cliente extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String direccion;

    @Override
    public String obtenerInformacion() {
        return "Cliente: " + nombre + " " + apellido + ", Dirección: " + direccion;
    }
}
