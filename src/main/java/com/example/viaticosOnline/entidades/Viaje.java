package com.example.viaticosOnline.entidades;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "viajes")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "destino")
    private String destino;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fechaInicio")
    private String fechaInicio;

    @Column(name = "fechaFin")
    private String fechaFin;

    @Column(name = "gastosPasaje")
    private Double gastosPasaje;

    @Column(name = "gastosTransporte")
    private Double gastosTranporte;

    @Column(name = "gastoAlimentacion")
    private Double gastosAlimentacion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_viaje", referencedColumnName = "id")
    @JsonBackReference
    private Empleado empleado;




    public Viaje() {
    }


    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getGastosPasaje() {
        return gastosPasaje;
    }

    public void setGastosPasaje(Double gastosPasaje) {
        this.gastosPasaje = gastosPasaje;
    }

    public Double getGastosTranporte() {
        return gastosTranporte;
    }

    public void setGastosTranporte(Double gastosTranporte) {
        this.gastosTranporte = gastosTranporte;
    }

    public Double getGastosAlimentacion() {
        return gastosAlimentacion;
    }

    public void setGastosAlimentacion(Double gastosAlimentacion) {
        this.gastosAlimentacion = gastosAlimentacion;
    }
}
