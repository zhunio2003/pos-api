package com.ista.posapi.controller;

import com.ista.posapi.entity.Persona;
import com.ista.posapi.service.PersonaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "*")
@Tag(name = "Personas", description = "API para gestión de personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    @Operation(summary = "Obtener todas las personas")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de personas obtenida exitosamente"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public ResponseEntity<List<Persona>> getAllPersonas() {
        try {
            List<Persona> personas = personaService.findAll();
            return new ResponseEntity<>(personas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener persona por ID")
    public ResponseEntity<Persona> getPersonaById(@PathVariable Integer id) {
        Optional<Persona> persona = personaService.findById(id);
        return persona.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                     .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    @Operation(summary = "Crear nueva persona")
    public ResponseEntity<Persona> createPersona(@Valid @RequestBody Persona persona) {
        try {
            Persona newPersona = personaService.save(persona);
            return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar persona")
    public ResponseEntity<Persona> updatePersona(@PathVariable Integer id, @Valid @RequestBody Persona persona) {
        Optional<Persona> existingPersona = personaService.findById(id);
        if (existingPersona.isPresent()) {
            persona.setIdPersona(id);
            Persona updatedPersona = personaService.save(persona);
            return new ResponseEntity<>(updatedPersona, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar persona")
    public ResponseEntity<HttpStatus> deletePersona(@PathVariable Integer id) {
        try {
            personaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dni/{dni}")
    @Operation(summary = "Buscar persona por DNI")
    public ResponseEntity<Persona> getPersonaByDni(@PathVariable String dni) {
        Optional<Persona> persona = personaService.findByDni(dni);
        return persona.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                     .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
