package com.ista.posapi.controller;

import com.ista.posapi.entity.Competencia;
import com.ista.posapi.service.CompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/competencias")
public class CompetenciaController {

    @Autowired
    private CompetenciaService competenciaService;

    @GetMapping
    public List<Competencia> findAll() {
        return competenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Competencia findById(@PathVariable Long id) {
        return competenciaService.findById(id);
    }

    @PostMapping
    public Competencia save(@RequestBody Competencia competencia) {
        return competenciaService.save(competencia);
    }

    @PutMapping("/{id}")
    public Competencia update(@PathVariable Long id, @RequestBody Competencia competencia) {
        competencia.setIdCompetencias(id);
        return competenciaService.save(competencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        competenciaService.delete(id);
    }
}
