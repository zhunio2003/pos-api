package com.ista.posapi.service;

import com.ista.posapi.entity.Persona;
import com.ista.posapi.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Optional<Persona> findById(Integer id) {
        return personaRepository.findById(id);
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public void deleteById(Integer id) {
        personaRepository.deleteById(id);
    }

    public Optional<Persona> findByDni(String dni) {
        return personaRepository.findByDni(dni);
    }

    public Optional<Persona> findByCorreo(String correo) {
        return personaRepository.findByCorreo(correo);
    }

    public List<Persona> findByNombre(String nombre, String apellido) {
        return personaRepository.findByNombreContainingOrApellidoContaining(nombre, apellido);
    }
}
