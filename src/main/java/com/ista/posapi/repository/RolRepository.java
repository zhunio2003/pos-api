package com.ista.posapi.repository;

import com.ista.posapi.entity.Rol;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

    @Query("SELECT r FROM Rol r WHERE r.nombre = :nombre")
    Optional<Rol> findByNombre(@Param("nombre") String nombre);

    @Query("SELECT r FROM Rol r WHERE r.estado = :estado")
    List<Rol> findByEstado(@Param("estado") Boolean estado);

    @Query("SELECT CASE WHEN COUNT(r) > 0 THEN true ELSE false END FROM Rol r WHERE r.nombre = :nombre")
    boolean existsByNombre(@Param("nombre") String nombre);

    @Query("SELECT r FROM Rol r WHERE r.estado = true")
    List<Rol> findActiveRoles();
}
