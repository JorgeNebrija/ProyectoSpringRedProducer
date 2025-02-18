package com.redproducer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CancionRepository extends JpaRepository<CancionRepository, Long> {
    List<CancionRepository> findByArtistaId(Long idArtista);
}