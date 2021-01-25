package com.example.Distribuidor.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Campana_detalleplan")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "plan"})
public class DetallePlan{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="plan_id")
    private Plan plan;  

    @ManyToOne
    @JoinColumn(name="servicio_id")
    private Servicio servicio;

    private Boolean ilimitado;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name="unidad_id")
    private Unidad unidad;

    private Integer vigencia;

    @ManyToOne
    @JoinColumn(name="periodo_id")
    private Periodo periodo;

    public Integer getServicio() {
        return this.servicio.getId();
    }

    public Boolean getIlimitado() {
        return this.ilimitado;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public Integer getUnidad() {
        if (this.unidad == null)
            return null;
        else
            return this.unidad.getId();
    }

    public Integer getVigencia() {
        return this.vigencia;
    }

    public Integer getPeriodo() {
        return this.periodo.getId();
    }

    public String getget_servicio_nombre() {
        return this.servicio.getNombre();
    }

    public String getget_unidad_nombre() {
        if (this.unidad == null)
            return null;
        else
            return this.unidad.getNombre();
    }

    public String getget_periodo_nombre() {
        return this.periodo.getNombre();
    }

    public Integer getget_tipo_servicio_orden() {
        Servicio s = this.servicio;
        TipoServicio ts = s.getTipoServicio();
        return ts.getOrden();
    }

} // Fin de public class DetallePlan









