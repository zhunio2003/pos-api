package com.ista.posapi.repository;

import com.ista.posapi.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    @Query("SELECT p FROM Persona p WHERE p.dni = :dni")
    Optional<Persona> findByDni(@Param("dni") String dni);

    @Query("SELECT p FROM Persona p WHERE p.correo = :correo")
    Optional<Persona> findByCorreo(@Param("correo") String correo);

    @Query("SELECT p FROM Persona p WHERE p.nombre LIKE %:nombre% OR p.apellido LIKE %:apellido%")
    List<Persona> findByNombreContainingOrApellidoContaining(@Param("nombre") String nombre, @Param("apellido") String apellido);
}
