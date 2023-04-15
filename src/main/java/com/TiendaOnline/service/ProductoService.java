package com.TiendaOnline.service;

import com.TiendaOnline.entity.Producto;
import com.TiendaOnline.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public Optional<Producto> getProducto(Integer id){
        return productoRepository.findById(id);
    }

    public List<Producto> getProducto(){
        return productoRepository.findAll();
    }

    public Producto insertProducto(Producto producto){
        return productoRepository.save(producto);
    }
    public void delete(Integer id){
        productoRepository.deleteById(id);
    }

}
