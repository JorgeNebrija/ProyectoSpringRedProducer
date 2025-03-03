package com.redproducer.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.redproducer.models.Cancion;

public interface CancionRepository extends JpaRepository<Cancion, Long> {
}
