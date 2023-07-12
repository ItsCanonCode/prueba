package com.itscanoncode.prueba.services;

import java.util.List;

import com.itscanoncode.prueba.model.Categoria;

public interface CategoriaService {
    
    public  Categoria save(Categoria categoria);
    
    public Categoria findByIdCategoria(Long id);

    public List<Categoria> findAllCategorias();

    public void deleteCategorias(Long id);
}
