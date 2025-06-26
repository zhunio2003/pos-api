package com.ista.posapi.repository;

import com.ista.posapi.entity.Clasificacion;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Long> {

    @Query("SELECT c FROM Clasificacion c WHERE c.grupo = :grupo")
    Optional<Clasificacion> findByGrupo(@Param("grupo") String grupo);

    @Query("SELECT c FROM Clasificacion c WHERE c.grupo LIKE %:grupo%")
    List<Clasificacion> findByGrupoContaining(@Param("grupo") String grupo);

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Clasificacion c WHERE c.grupo = :grupo")
    boolean existsByGrupo(@Param("grupo") String grupo);
}
