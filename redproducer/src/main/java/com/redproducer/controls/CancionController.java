package com.redproducer.controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redproducer.models.Cancion;
import com.redproducer.repositories.CancionRepository;
import com.redproducer.services.CancionService;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // Permite peticiones desde el frontend
@RequestMapping("/api/canciones")

public class CancionController {
	@Autowired
	private CancionService cancionService;
	@GetMapping
	public List<Cancion> obtenerTodasLasCanciones() {
		return cancionService.obtenerTodasLasCanciones();
	}
	@GetMapping("/artista/{idArtista}")
	public List<Cancion> obtenerCancionesPorArtista(@PathVariable Long idArtista) {
		return cancionService.obtenerCancionesPorArtista(idArtista);
	}
}
