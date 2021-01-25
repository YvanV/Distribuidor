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
@Table(name="Campana_producto")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "empresa"})
public class Producto{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;  

    @OneToMany(mappedBy = "producto")
    private Set<Campana> campanas;


    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public Set<Campana> getCampanas() {
        return this.campanas;
    }


    
} // Fin de public class Producto
