package com.ista.posapi.service;

import com.ista.posapi.entity.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> findAll();
    Producto findById(Long id);
    Producto save(Producto entity);
    void deleteById(Long id);
}
