package com.ista.posapi.repository;

import com.ista.posapi.entity.Factura;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    @Query("SELECT f FROM Factura f WHERE f.serie = :serie")
    List<Factura> findBySerie(@Param("serie") String serie);

    @Query("SELECT f FROM Factura f WHERE f.idPersona = :idPersona")
    List<Factura> findByIdPersona(@Param("idPersona") Integer idPersona);

    @Query("SELECT f FROM Factura f WHERE f.fecha BETWEEN :fechaInicio AND :fechaFin")
    List<Factura> findByFechaBetween(@Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin);

    @Query("SELECT f FROM Factura f WHERE f.idTipoPago = :idTipoPago")
    List<Factura> findByIdTipoPago(@Param("idTipoPago") Integer idTipoPago);

    @Query("SELECT SUM(f.total) FROM Factura f WHERE f.fecha BETWEEN :fechaInicio AND :fechaFin")
    Double getTotalVentasByFecha(@Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin);

    List<Factura> findByIdPersona(Long idPersona);

}
