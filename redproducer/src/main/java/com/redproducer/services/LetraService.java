package com.redproducer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redproducer.models.Letra;
import com.redproducer.repositories.LetraRepository;

@Service
public class LetraService {
    @Autowired
    private LetraRepository letraRepository;
    public List<Letra> obtenerLetrasPorCancion(Long idCancion) {
        return letraRepository.findByCancionId(idCancion);
    }
}
