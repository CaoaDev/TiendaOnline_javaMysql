package com.TiendaOnline.entity;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Nombre_Producto")
    private String nombre_producto;
    @Column(name = "Precio")
    private Double precio;
    @Column(name = "Codigo_Barra")
    private String codigo_barra;

    @Column(name = "Existencia")
    private Integer existencia;

    public Producto() {}

    public Producto(Integer id, String nombre_producto, Double precio, String codigo_barra, Integer existencia) {
        this.id = id;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.codigo_barra = codigo_barra;
        this.existencia = existencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(String codigo_barra) {
        this.codigo_barra = codigo_barra;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }
}
