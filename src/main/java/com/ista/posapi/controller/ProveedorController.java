package com.ista.posapi.controller;

import com.ista.posapi.entity.Proveedores;
import com.ista.posapi.service.ProveedorService;
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
@RequestMapping("/api/proveedores")
@CrossOrigin(origins = "*")
@Tag(name = "Proveedores", description = "API para gestión de proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping
    @Operation(summary = "Obtener todos los proveedores")
    public ResponseEntity<List<Proveedores>> getAllProveedores() {
        return new ResponseEntity<>(proveedorService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener proveedor por ID")
    public ResponseEntity<Proveedores> getProveedorById(@PathVariable Long id) {
        Proveedores proveedor = proveedorService.findById(id);
        if (proveedor != null) {
            return new ResponseEntity<>(proveedor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping
    @Operation(summary = "Crear nuevo proveedor")
    public ResponseEntity<Proveedores> createProveedor(@Valid @RequestBody Proveedores proveedor) {
        return new ResponseEntity<>(proveedorService.save(proveedor), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar proveedor")
    public ResponseEntity<Proveedores> updateProveedor(@PathVariable Long id, @Valid @RequestBody Proveedores proveedor) {
        Proveedores existente = proveedorService.findById(id);
        if (existente != null) {
            proveedor.setIdProveedor(id);
            return new ResponseEntity<>(proveedorService.save(proveedor), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar proveedor")
    public ResponseEntity<HttpStatus> deleteProveedor(@PathVariable Long id) {
        proveedorService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
