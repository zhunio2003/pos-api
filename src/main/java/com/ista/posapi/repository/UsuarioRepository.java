package com.ista.posapi.repository;

import com.ista.posapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT u FROM Usuario u WHERE u.user = :user")
    Optional<Usuario> findByUser(@Param("user") String user);

    @Query("SELECT u FROM Usuario u WHERE u.user = :user AND u.password = :password")
    Optional<Usuario> findByUserAndPassword(@Param("user") String user, @Param("password") String password);

    @Query("SELECT u FROM Usuario u WHERE u.idPersona = :idPersona")
    List<Usuario> findByIdPersona(@Param("idPersona") Integer idPersona);

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM Usuario u WHERE u.user = :user")
    boolean existsByUser(@Param("user") String user);
}
