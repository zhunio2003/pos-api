package com.ista.posapi.service;

import com.ista.posapi.entity.Competencia;
import com.ista.posapi.repository.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenciaService {

    @Autowired
    private CompetenciaRepository competenciaRepository;

    public List<Competencia> findAll() {
        return competenciaRepository.findAll();
    }

    public Competencia findById(Long id) {
        return competenciaRepository.findById(id).orElse(null);
    }

    public Competencia save(Competencia competencia) {
        return competenciaRepository.save(competencia);
    }

    public void delete(Long id) {
        competenciaRepository.deleteById(id);
    }
}
