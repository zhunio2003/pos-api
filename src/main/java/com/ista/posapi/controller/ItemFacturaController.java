package com.ista.posapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ista.posapi.entity.ItemFactura;
import com.ista.posapi.service.ItemFacturaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/items-factura")
@CrossOrigin(origins = "*")
@Tag(name = "Items Factura", description = "API para gestión de items de factura")
public class ItemFacturaController {

    @Autowired
    private ItemFacturaService itemFacturaService;

    @GetMapping
    @Operation(summary = "Obtener todos los items de factura")
    public ResponseEntity<List<ItemFactura>> getAllItemsFactura() {
        try {
            return new ResponseEntity<>(itemFacturaService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener item de factura por ID")
    public ResponseEntity<ItemFactura> getItemFacturaById(@PathVariable Long id) {
        ItemFactura item = itemFacturaService.findById(id);
        if (item != null) {
            return new ResponseEntity<>(item, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @Operation(summary = "Crear nuevo item de factura")
    public ResponseEntity<ItemFactura> createItemFactura(@Valid @RequestBody ItemFactura itemFactura) {
        
    	try {
            return new ResponseEntity<>(itemFacturaService.save(itemFactura), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar item de factura")
    public ResponseEntity<ItemFactura> updateItemFactura(@PathVariable Long id, @Valid @RequestBody ItemFactura itemFactura) {
        ItemFactura existente = itemFacturaService.findById(id);
        if (existente != null) {
            itemFactura.setIdItemFactura(id);
            return new ResponseEntity<>(itemFacturaService.save(itemFactura), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar item de factura")
    public ResponseEntity<HttpStatus> deleteItemFactura(@PathVariable Long id) {
        try {
            itemFacturaService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
