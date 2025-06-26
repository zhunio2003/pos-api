package com.ista.posapi.service;

import com.ista.posapi.entity.Factura;

import java.util.List;

public interface FacturaService {
    List<Factura> findAll();
    Factura findById(Long id);
    Factura save(Factura entity);
    void deleteById(Long id);
    List<Factura> findByIdPersona(Long idPersona);
    List<Factura> findBySerie(String serie);

}
