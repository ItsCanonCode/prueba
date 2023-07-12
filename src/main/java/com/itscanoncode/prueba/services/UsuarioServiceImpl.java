package com.itscanoncode.prueba.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itscanoncode.prueba.model.Usuario;
import com.itscanoncode.prueba.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario save(Usuario usuario) {
        // TODO Auto-generated method stub
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findByIdUsuario(Long id) {
        // TODO Auto-generated method stub
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> findAllUsuarios() {
        // TODO Auto-generated method stub
        return usuarioRepository.findAll();
    }

    @Override
    public void deleteUsuario(Long id) {
        // TODO Auto-generated method stub
        usuarioRepository.deleteById(id);
    }
    
}
