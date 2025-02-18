package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redproducer.models.Artista;
import com.redproducer.repositories.ArtistaRepository;

@Service
public class ArtistaService {
    @Autowired
    private ArtistaRepository artistaRepository;

    public List<ArtistaRepository> obtenerTodosLosArtistas() {
        return artistaRepository.findAll();
    }
}