package com.TiendaOnline.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Carrito")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "precio_total")
    private Double precio_total;

    @OneToMany
    @JoinColumn(name = "id_producto")
    private List<Producto> producto;

    @Column(name = "cantidad_producto")
    private Integer cantidad_producto;

    @Column(name = "total_venta")
    private Double total_venta;

    public Carrito() {}

    public Carrito(Integer id, Double precio_total, List<Producto> producto, Integer cantidad_producto, Double total_venta) {
        this.id = id;
        this.precio_total = precio_total;
        this.producto = producto;
        this.cantidad_producto = cantidad_producto;
        this.total_venta = total_venta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Double precio_total) {
        this.precio_total = precio_total;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public Integer getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(Integer cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public Double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(Double total_venta) {
        this.total_venta = total_venta;
    }
}
