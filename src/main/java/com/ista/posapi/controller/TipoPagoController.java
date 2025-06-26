package com.ista.posapi.controller;

import com.ista.posapi.entity.TipoPago;
import com.ista.posapi.service.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipopagos")
public class TipoPagoController {

    @Autowired
    private TipoPagoService tipoPagoService;

    @GetMapping
    public List<TipoPago> findAll() {
        return tipoPagoService.findAll();
    }

    @GetMapping("/{id}")
    public TipoPago findById(@PathVariable Long id) {
        return tipoPagoService.findById(id);
    }

    @PostMapping
    public TipoPago save(@RequestBody TipoPago tipoPago) {
        return tipoPagoService.save(tipoPago);
    }

    @PutMapping("/{id}")
    public TipoPago update(@PathVariable Long id, @RequestBody TipoPago tipoPago) {
        tipoPago.setIdTipoPago(id);
        return tipoPagoService.save(tipoPago);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tipoPagoService.deleteById(id);
    }
}
