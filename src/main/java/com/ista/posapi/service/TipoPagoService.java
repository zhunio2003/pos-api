
package com.ista.posapi.service;

import com.ista.posapi.entity.TipoPago;
import com.ista.posapi.repository.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoService {

    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    public List<TipoPago> findAll() {
        return tipoPagoRepository.findAll();
    }

    public TipoPago findById(Long id) {
        return tipoPagoRepository.findById(id).orElse(null);
    }

    public TipoPago save(TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    public void deleteById(Long id) {
        tipoPagoRepository.deleteById(id);
    }
}
