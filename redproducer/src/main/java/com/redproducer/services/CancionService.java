package com.redproducer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redproducer.models.Cancion;
import com.redproducer.repositories.CancionRepository;

@Service
public class CancionService {
    @Autowired
    private CancionRepository cancionRepository;
    public List<Cancion> obtenerTodasLasCanciones() {
        return cancionRepository.findAll();
    }
    public List<Cancion> obtenerCancionesPorArtista(Long idArtista) {
        return cancionRepository.findByArtistaId(idArtista);
    }
}
