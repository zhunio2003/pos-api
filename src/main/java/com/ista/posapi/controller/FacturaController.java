
package com.ista.posapi.controller;

import com.ista.posapi.entity.Factura;
import com.ista.posapi.service.FacturaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facturas")
@CrossOrigin(origins = "*")
@Tag(name = "Facturas", description = "API para gestión de facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    @Operation(summary = "Obtener todas las facturas")
    public ResponseEntity<List<Factura>> getAllFacturas() {
        try {
            return new ResponseEntity<>(facturaService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener factura por ID")
    public ResponseEntity<Factura> getFacturaById(@PathVariable Long id) {
        Factura factura = facturaService.findById(id);
        if (factura != null) {
            return new ResponseEntity<>(factura, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping
    @Operation(summary = "Crear nueva factura")
    public ResponseEntity<Factura> createFactura(@Valid @RequestBody Factura factura) {
        try {
            return new ResponseEntity<>(facturaService.save(factura), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar factura")
    public ResponseEntity<Factura> updateFactura(@PathVariable Long id, @Valid @RequestBody Factura factura) {
        Factura existente = facturaService.findById(id);
        if (existente != null) {
            factura.setIdFactura(id);
            return new ResponseEntity<>(facturaService.save(factura), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar factura")
    public ResponseEntity<HttpStatus> deleteFactura(@PathVariable Long id) {
        try {
            facturaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/persona/{idPersona}")
    @Operation(summary = "Obtener facturas por persona")
    public ResponseEntity<List<Factura>> getFacturasByPersona(@PathVariable Long idPersona) {
        return new ResponseEntity<>(facturaService.findByIdPersona(idPersona), HttpStatus.OK);
    }

    @GetMapping("/serie/{serie}")
    @Operation(summary = "Obtener facturas por serie")
    public ResponseEntity<List<Factura>> getFacturasBySerie(@PathVariable String serie) {
        return new ResponseEntity<>(facturaService.findBySerie(serie), HttpStatus.OK);
    }
}
