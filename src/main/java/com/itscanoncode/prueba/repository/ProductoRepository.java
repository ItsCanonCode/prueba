package com.itscanoncode.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itscanoncode.prueba.model.Producto;

@Repository
public interface  ProductoRepository extends JpaRepository<Producto,Long> {
      
    
}
