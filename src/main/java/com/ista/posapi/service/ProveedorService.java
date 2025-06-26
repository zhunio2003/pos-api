package com.ista.posapi.service;

import com.ista.posapi.entity.Proveedores;
import com.ista.posapi.repository.ProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedoresRepository proveedorRepository;

    public List<Proveedores> findAll() {
        return proveedorRepository.findAll();
    }

    public Proveedores findById(Long id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    public Proveedores save(Proveedores proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void delete(Long id) {
        proveedorRepository.deleteById(id);
    }
}
