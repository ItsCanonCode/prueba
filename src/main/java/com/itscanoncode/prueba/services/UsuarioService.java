package com.itscanoncode.prueba.services;


import java.util.List;

import com.itscanoncode.prueba.model.Usuario;

public interface UsuarioService {
    
    public Usuario save(Usuario usuario);

    public Usuario findByIdUsuario(Long id);

    public List<Usuario> findAllUsuarios();

    public void deleteUsuario(Long id);
}
