package com.itscanoncode.prueba.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Producto {
    /* d: Long (identificador único del producto)
        name: String (nombre del producto)
        description: String (descripción del producto)
        price: BigDecimal (precio del producto)
        quantity: Integer (cantidad disponible del producto)
} */
    @Id
    @GeneratedValue
    Long id;
    String name;
    String description;
    BigDecimal price;
    Integer quantity;



    
    public Producto() {
    }
    
    public Producto(String name, String description, BigDecimal price, Integer quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    

}
