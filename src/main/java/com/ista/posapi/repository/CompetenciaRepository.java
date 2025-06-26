package com.ista.posapi.repository;

import com.ista.posapi.entity.Competencia;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CompetenciaRepository extends JpaRepository<Competencia, Long> {

    @Query("SELECT c FROM Competencia c WHERE c.nombre = :nombre")
    Optional<Competencia> findByNombre(@Param("nombre") String nombre);

    @Query("SELECT c FROM Competencia c WHERE c.nombre LIKE %:nombre%")
    List<Competencia> findByNombreContaining(@Param("nombre") String nombre);

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Competencia c WHERE c.nombre = :nombre")
    boolean existsByNombre(@Param("nombre") String nombre);
}
