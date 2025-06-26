package com.ista.posapi.repository;

import com.ista.posapi.entity.Proveedores;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedores, Long> {

    @Query("SELECT p FROM Proveedores p WHERE p.ruc = :ruc")
    Optional<Proveedores> findByRuc(@Param("ruc") String ruc);

    @Query("SELECT p FROM Proveedores p WHERE p.pais = :pais")
    List<Proveedores> findByPais(@Param("pais") String pais);

    @Query("SELECT p FROM Proveedores p WHERE p.correo = :correo")
    Optional<Proveedores> findByCorreo(@Param("correo") String correo);

    @Query("SELECT p FROM Proveedores p WHERE p.moneda = :moneda")
    List<Proveedores> findByMoneda(@Param("moneda") String moneda);

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Proveedores p WHERE p.ruc = :ruc")
    boolean existsByRuc(@Param("ruc") String ruc);
}
