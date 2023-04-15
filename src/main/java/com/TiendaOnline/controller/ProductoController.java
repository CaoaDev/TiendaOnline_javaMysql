package com.TiendaOnline.controller;

import com.TiendaOnline.entity.Producto;
import com.TiendaOnline.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("dev/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("/{id}")
    public Optional<Producto> buscarProducto(@PathVariable int id){
        return productoService.getProducto(id);
    }

    @GetMapping("/")
    public List<Producto> getProducto(){
        return productoService.getProducto();
    }

    @PostMapping("/insert")
    public Producto insertProducto(@RequestBody Producto producto){
        return productoService.insertProducto(producto);
    }
    @PutMapping("/modificar")
    public Producto modificarProducto(@RequestBody Producto producto){
        return productoService.modificarProducto(producto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        productoService.delete(id);
    }
}
