package com.example.Distribuidor.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Campana_periodo")
public class Periodo {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    private String nombre;


    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }


} // Fin de public class Periodo



