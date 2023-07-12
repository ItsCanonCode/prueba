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
import com.itscanoncode.prueba.repository.CategoriaRepository;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
     Logger log = LoggerFactory.getLogger(getClass());

     @Autowired
     private CategoriaRepository categoriaRepository;

   
     @GetMapping("/{id}")
     @CrossOrigin(origins = "http://localhost:4200")
     public Categoria findCategoria(@PathVariable Long id){
        return categoriaRepository.findById(id).orElseThrow();
     }

     @GetMapping("/list")
     @CrossOrigin(origins = "http://localhost:4200")
     public List<Categoria> listCategorias(){
        return categoriaRepository.findAll();
     }

     @GetMapping("/delete/{id}")
      @CrossOrigin(origins = "http://localhost:4200")
      public void deleteCategoria(@PathVariable Long id){
        categoriaRepository.deleteById(id);
      }

    @GetMapping("/save")
      @CrossOrigin(origins = "http://localhost:4200")
      public String saveCategoria(@ModelAttribute Categoria categoria, Model model){
        categoriaRepository.save(categoria);
        return "redirect:/categoria/read";
      }
    
    @GetMapping("/create")
      @CrossOrigin(origins = "http://localhost:4200")
      public Categoria createCategoria(@RequestBody Categoria newCategoria){
        return categoriaRepository.save(newCategoria);
      }

    @GetMapping("/update/{id}")
     @CrossOrigin(origins = "http://localhost:4200")
     public String updateCategoria(@PathVariable Long id, Model model){
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        model.addAttribute("categoria", categoria);
        return "categoria/update";
     }
    
        

    @GetMapping("/")
    String index(){
        return "index";
    }



}
