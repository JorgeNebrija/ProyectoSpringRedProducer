package com.redproducer.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.redproducer.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);  // Busca un usuario por su nombre de usuario
}