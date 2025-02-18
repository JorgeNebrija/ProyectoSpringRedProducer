package com.redproducer.controls;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redproducer.models.Artista;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {
    @Autowired
    private ArtistaService artistaService;

    @GetMapping
    public List<Artista> obtenerArtistas() {
        return artistaService.obtenerTodosLosArtistas();
    }
}
