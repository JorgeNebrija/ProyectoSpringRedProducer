package com.redproducer.services;

import org.springframework.stereotype.Service;

import com.redproducer.models.Cancion;
import com.redproducer.repositories.CancionRepository;

import java.util.List;

@Service
public class CancionService {

    private final CancionRepository cancionRepository;

    public CancionService(CancionRepository cancionRepository) {
        this.cancionRepository = cancionRepository;
    }

    public List<Cancion> obtenerTodasLasCanciones() {
        List<Cancion> canciones = cancionRepository.findAll();
        System.out.println("Canciones en la base de datos: " + canciones.size()); //Ver cuántas canciones devuelve
        return canciones;
    }
    
}
