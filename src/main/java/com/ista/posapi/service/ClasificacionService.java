package com.ista.posapi.service;

import com.ista.posapi.entity.Clasificacion;
import com.ista.posapi.repository.ClasificacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasificacionService {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    public List<Clasificacion> findAll() {
        return clasificacionRepository.findAll();
    }

    public Clasificacion findById(Long id) {
        return clasificacionRepository.findById(id).orElse(null);
    }

    public Clasificacion save(Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    public void delete(Long id) {
        clasificacionRepository.deleteById(id);
    }
}
