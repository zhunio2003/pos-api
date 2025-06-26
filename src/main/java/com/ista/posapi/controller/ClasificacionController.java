package com.ista.posapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ista.posapi.entity.Clasificacion;
import com.ista.posapi.service.ClasificacionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clasificaciones")
@CrossOrigin(origins = "*")
@Tag(name = "Clasificaciones", description = "API para gestión de clasificaciones")
public class ClasificacionController {

    @Autowired
    private ClasificacionService clasificacionService;

    @GetMapping
    @Operation(summary = "Obtener todas las clasificaciones")
    public ResponseEntity<List<Clasificacion>> getAllClasificaciones() {
        return new ResponseEntity<>(clasificacionService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener clasificación por ID")
    public ResponseEntity<Clasificacion> getClasificacionById(@PathVariable Long id) {
        Clasificacion clasificacion = clasificacionService.findById(id);
        if (clasificacion != null) {
            return new ResponseEntity<>(clasificacion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @Operation(summary = "Crear nueva clasificación")
    public ResponseEntity<Clasificacion> createClasificacion(@Valid @RequestBody Clasificacion clasificacion) {
        return new ResponseEntity<>(clasificacionService.save(clasificacion), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar clasificación")
    public ResponseEntity<Clasificacion> updateClasificacion(@PathVariable Long id, @Valid @RequestBody Clasificacion clasificacion) {
        Clasificacion existente = clasificacionService.findById(id);
        if (existente != null) {
            clasificacion.setIdClasificacion(id);
            return new ResponseEntity<>(clasificacionService.save(clasificacion), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar clasificación")
    public ResponseEntity<HttpStatus> deleteClasificacion(@PathVariable Long id) {
        clasificacionService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
