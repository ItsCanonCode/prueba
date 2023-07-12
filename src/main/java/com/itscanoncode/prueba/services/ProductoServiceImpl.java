package com.itscanoncode.prueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itscanoncode.prueba.model.Producto;
import com.itscanoncode.prueba.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto producto) {
        // TODO Auto-generated method stub
        return productoRepository.save(producto);
    }

    @Override
    public Producto findByIdProducto(Long id) {
        // TODO Auto-generated method stub
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Producto> findAllProductos() {
        // TODO Auto-generated method stub
        return productoRepository.findAll();
    }

    @Override
    public void deleteProducto(Long id) {
        // TODO Auto-generated method stub
        productoRepository.deleteById(id);
    }
    
}
