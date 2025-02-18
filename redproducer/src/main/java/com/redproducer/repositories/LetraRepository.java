package com.redproducer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.redproducer.models.Letra; // Importa la entidad correctamente

public interface LetraRepository extends JpaRepository<Letra, Long> {
    List<Letra> findByCancionId(Long idCancion);
}