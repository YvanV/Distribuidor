package com.example.Distribuidor.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Campana_servicio")
public class Servicio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name="tipo_servicio_id")
    private TipoServicio tipoServicio;


    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public TipoServicio getTipoServicio() {
        return this.tipoServicio;
    }


} // Fin de public class Servicio


