package com.itscanoncode.prueba.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itscanoncode.prueba.model.Categoria;
import com.itscanoncode.prueba.model.Producto;
import com.itscanoncode.prueba.repository.ProductoRepository;
import com.itscanoncode.prueba.services.CategoriaService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaService categoriaService;

   @GetMapping("/{id}")
     @CrossOrigin(origins = "http://localhost:4200")
     public Producto findProducto(@PathVariable Long id){
        return productoRepository.findById(id).orElseThrow();
     }

    @GetMapping("/list")
     @CrossOrigin(origins = "http://localhost:4200")
     public List<Producto> listProductos(){
        return productoRepository.findAll();
     }

     @GetMapping("/delete/{id}")
     @CrossOrigin(origins = "http://localhost:4200")
     public void deleteProducto(@PathVariable Long id){
       productoRepository.deleteById(id);
     }

      @GetMapping("/save")
      @CrossOrigin(origins = "http://localhost:4200")
      public String saveProducto(@ModelAttribute Producto producto, Model model){
        productoRepository.save(producto);
        return "redirect:/producto/read";
      }

      @GetMapping("/create")
      @CrossOrigin(origins = "http://localhost:4200")
      public Producto createProducto(@RequestBody Producto newProducto){
        return productoRepository.save(newProducto);
      }

    @GetMapping("/update/{id}")
     @CrossOrigin(origins = "http://localhost:4200")
     public String updateProducto(@PathVariable Long id, Model model){
        Producto producto = productoRepository.findById(id).orElseThrow();
        model.addAttribute("producto", producto);
        return "producto/update";
     }

     //Categoria

     @GetMapping("/")
     String index(){
         return "index";
     }

     @GetMapping("/categoria/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Categoria findCategoria(@PathVariable Long id){
    return categoriaService.findByIdCategoria(id);
}

    @GetMapping("/ListCategoria")
        @CrossOrigin(origins = "http://localhost:4200")
        public List<Categoria> listCategorias(){
            return categoriaService.findAllCategorias();
    }
 

}