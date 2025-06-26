package com.ista.posapi.repository;

import com.ista.posapi.entity.ItemFactura;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface ItemFacturaRepository extends JpaRepository<ItemFactura, Long> {

    @Query("SELECT if FROM ItemFactura if WHERE if.idFactura = :idFactura")
    List<ItemFactura> findByIdFactura(@Param("idFactura") Integer idFactura);

    @Query("SELECT if FROM ItemFactura if WHERE if.idProducto = :idProducto")
    List<ItemFactura> findByIdProducto(@Param("idProducto") Integer idProducto);

    @Query("SELECT SUM(if.cantidad) FROM ItemFactura if WHERE if.idProducto = :idProducto")
    Integer getTotalCantidadByProducto(@Param("idProducto") Integer idProducto);

    @Query("SELECT SUM(if.subtotal) FROM ItemFactura if WHERE if.idFactura = :idFactura")
    Double getTotalSubtotalByFactura(@Param("idFactura") Integer idFactura);
}
