package com.ista.posapi.controller;

import com.ista.posapi.entity.Rol;
import com.ista.posapi.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> findAll() {
        return rolService.findAll();
    }

    @GetMapping("/{id}")
    public Rol findById(@PathVariable Long id) {
        return rolService.findById(id);
    }

    @PostMapping
    public Rol save(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    @PutMapping("/{id}")
    public Rol update(@PathVariable Long id, @RequestBody Rol rol) {
        rol.setIdRol(id);
        return rolService.save(rol);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        rolService.deleteById(id);
    }
}
