package com.itscanoncode.prueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itscanoncode.prueba.model.Categoria;
import com.itscanoncode.prueba.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

   
    @Override
    public Categoria findByIdCategoria(Long id) {
        // TODO Auto-generated method stub
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Categoria> findAllCategorias() {
        // TODO Auto-generated method stub
        return categoriaRepository.findAll();
    }

    @Override
    public void deleteCategorias(Long id) {
        // TODO Auto-generated method stub
        categoriaRepository.deleteById(id);
    }
}
