package com.ista.posapi.repository;

import com.ista.posapi.entity.Producto;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query("SELECT p FROM Producto p WHERE p.idClasificacion = :idClasificacion")
    List<Producto> findByIdClasificacion(@Param("idClasificacion") Integer idClasificacion);

    @Query("SELECT p FROM Producto p WHERE p.idProveedor = :idProveedor")
    List<Producto> findByIdProveedor(@Param("idProveedor") Integer idProveedor);

    @Query("SELECT p FROM Producto p WHERE p.stock < :minStock")
    List<Producto> findByStockLessThan(@Param("minStock") Integer minStock);

    @Query("SELECT p FROM Producto p WHERE p.iva = :iva")
    List<Producto> findByIva(@Param("iva") Boolean iva);

    @Query("SELECT p FROM Producto p WHERE p.stock > 0")
    List<Producto> findProductosEnStock();

    @Query("SELECT p FROM Producto p WHERE p.precioUnitario BETWEEN :precioMin AND :precioMax")
    List<Producto> findByPrecioUnitarioBetween(@Param("precioMin") Double precioMin, @Param("precioMax") Double precioMax);
}
