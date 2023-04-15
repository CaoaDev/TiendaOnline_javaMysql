package com.TiendaOnline.service;
import com.TiendaOnline.entity.Carrito;
import com.TiendaOnline.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoService {
    @Autowired
    CarritoRepository carritoRepository;

    public Optional<Carrito> getCarrito(Integer id){
        return carritoRepository.findById(id);
    }

    public List<Carrito> getCarrito(){
        return carritoRepository.findAll();
    }

    public Carrito insertCarrito(Carrito carrito){return carritoRepository.save(carrito);}
    public void delete(Integer id){
        carritoRepository.deleteById(id);
    }
}
