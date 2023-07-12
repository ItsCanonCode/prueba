package com.itscanoncode.prueba.services;

import java.util.List;

import com.itscanoncode.prueba.model.Producto;

public interface ProductoService {
    public Producto save(Producto producto);
    
    public Producto findByIdProducto(Long id);

    public List<Producto> findAllProductos();

    public void deleteProducto(Long id);
}
