package com.ista.posapi.service;

import com.ista.posapi.entity.Factura;
import com.ista.posapi.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura findById(Long id) {
        return facturaRepository.findById(id.intValue()).orElse(null);
    }

    @Override
    public Factura save(Factura entity) {
        return facturaRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        facturaRepository.deleteById(id.intValue());
    }

    @Override
    public List<Factura> findByIdPersona(Long idPersona) {
        return facturaRepository.findByIdPersona(idPersona.intValue());
    }

    @Override
    public List<Factura> findBySerie(String serie) {
        return facturaRepository.findBySerie(serie);
    }
}
