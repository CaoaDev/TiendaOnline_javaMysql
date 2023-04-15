package com.TiendaOnline.controller;
import com.TiendaOnline.entity.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.TiendaOnline.service.CarritoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev/carrito")
public class CarritoController {
    @Autowired
    CarritoService carritoService;
    @GetMapping("/{id}")
    public Optional<Carrito> buscarCarrito(@PathVariable int id){return carritoService.getCarrito(id); }

    @GetMapping("/")
    public List<Carrito> getCarrito(){
        return carritoService.getCarrito();
    }

    @PostMapping("/insert")
    public Carrito insertCarrito(@RequestBody Carrito carrito){
        return carritoService.insertCarrito(carrito);
    }

    @PutMapping("/modificar")
    public Carrito modificarCarrito(@RequestBody Carrito carrito) {
        return carritoService.modificarCarrito(carrito);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){carritoService.delete(id); }
}
