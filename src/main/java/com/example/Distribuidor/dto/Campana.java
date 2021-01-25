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
@Table(name="Campana_campana")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "producto"})
public class Campana{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name="producto_id")
    private Producto producto;  

    @OneToMany(mappedBy = "campana")
    private Set<Plan> planes;


    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public Set<Plan> getPlanes() {
        return this.planes;
    }


} // Fin de public class Campana

