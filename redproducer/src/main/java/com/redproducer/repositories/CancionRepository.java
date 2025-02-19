package com.redproducer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redproducer.models.Cancion;

public interface CancionRepository extends JpaRepository<Cancion, Long> {
}
