package com.example.Distribuidor.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Set;

@Entity
@Table(name="Campana_empresa")
public class Empresa{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;

    @OneToMany(mappedBy = "empresa")
    private Set<Producto> productos;


    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Set<Producto> getProductos() {
        return this.productos;
    }

    
} // Fin de public class Empresa
