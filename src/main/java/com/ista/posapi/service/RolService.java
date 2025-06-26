package com.ista.posapi.service;

import com.ista.posapi.entity.Rol;

import java.util.List;

public interface RolService {
    List<Rol> findAll();
    Rol findById(Long id);
    Rol save(Rol entity);
    void deleteById(Long id);
}
