package com.redproducer.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "canciones")
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String portada;
    private String audio;
    private int duracion;
    private int delay;

    @ManyToOne
    @JoinColumn(name = "id_artista")
    @JsonIgnoreProperties("canciones") // Evita recursión infinita en Artista
    private Artista artista;

    @OneToMany(mappedBy = "cancion", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
@JsonIgnoreProperties("cancion") // Evita recursión infinita
private List<Letra> letra;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getPortada() { return portada; }
    public void setPortada(String portada) { this.portada = portada; }

    public String getAudio() { return audio; }
    public void setAudio(String audio) { this.audio = audio; }

    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }

    public int getDelay() { return delay; }
    public void setDelay(int delay) { this.delay = delay; }

    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }

    public List<Letra> getLetra() { return letra; }
    public void setLetra(List<Letra> letra) { this.letra = letra; }
}
