package com.example.Distribuidor.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

@Entity
@Table(name="Campana_plan")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "campana"})
public class Plan{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name="campana_id")
    private Campana campana;  

    @OneToMany(mappedBy = "plan")
    private Set<DetallePlan> detallesPlan;


    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Campana getCampana() {
        return this.campana;
    }

    public Set<DetallePlan> getDetallesPlan() {
        return this.detallesPlan;
    }



} // Fin de public class Plan

