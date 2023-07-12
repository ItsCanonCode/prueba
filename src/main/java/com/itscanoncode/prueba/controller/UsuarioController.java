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

import com.itscanoncode.prueba.model.Usuario;
import com.itscanoncode.prueba.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UsuarioRepository usuarioRepository;


    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Usuario findUsuario(@PathVariable Long id){
        return usuarioRepository.findById(id).orElseThrow(null);
    }

    @GetMapping("/list")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Usuario> listUsuarios(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteUsuario(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }

    @GetMapping("/save")
    @CrossOrigin(origins = "http://localhost:4200")
    public String saveUsuario(@ModelAttribute Usuario usuario, Model model){
        usuarioRepository.save(usuario);
        return "redirect:/usuario/read";
    }

    @GetMapping("/create")
    @CrossOrigin(origins = "http://localhost:4200")
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/update/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public String updateUsuario (@PathVariable Long id, Model model){
        Usuario usuario = usuarioRepository.findById(id).orElseThrow();
        model.addAttribute("usuario", usuario);
        return "usuario/update";
    }

    @GetMapping("/")
    String index(){
        return "index";
    }
}
