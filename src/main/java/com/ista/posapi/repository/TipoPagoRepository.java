package com.ista.posapi.repository;

import com.ista.posapi.entity.TipoPago;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface TipoPagoRepository extends JpaRepository<TipoPago, Long> {

    @Query("SELECT tp FROM TipoPago tp WHERE tp.tipo = :tipo")
    Optional<TipoPago> findByTipo(@Param("tipo") String tipo);

    @Query("SELECT tp FROM TipoPago tp WHERE tp.tipo LIKE %:tipo%")
    List<TipoPago> findByTipoContaining(@Param("tipo") String tipo);
}
