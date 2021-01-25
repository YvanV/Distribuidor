package com.example.Distribuidor.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Campana_unidad")
public class Unidad {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;


    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

} // Fin de public class Unidad
