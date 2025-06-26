package com.ista.posapi.service;

import com.ista.posapi.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    Usuario save(Usuario entity);
    void deleteById(Long id);
}
