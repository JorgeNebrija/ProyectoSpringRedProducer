package com.redproducer.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redproducer.models.Letra;
import com.redproducer.repositories.LetraRepository;
import com.redproducer.services.LetraService;

@RestController
@RequestMapping("/api/letras")
public class LetraController {
    @Autowired
    private LetraService letraService;
    @GetMapping("/cancion/{idCancion}")
    public List<Letra> obtenerLetrasPorCancion(@PathVariable Long idCancion) {
        return letraService.obtenerLetrasPorCancion(idCancion);
    }
}

