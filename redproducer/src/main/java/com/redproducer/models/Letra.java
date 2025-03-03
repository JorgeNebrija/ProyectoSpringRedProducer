package com.redproducer.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "letras")
public class Letra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int tiempo;
    private String texto;

    @ManyToOne
    @JoinColumn(name = "id_cancion")
    @JsonIgnore // Evita que Letra serialice la Cancion y cause recursión infinita
    private Cancion cancion;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getTiempo() { return tiempo; }
    public void setTiempo(int tiempo) { this.tiempo = tiempo; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public Cancion getCancion() { return cancion; }
    public void setCancion(Cancion cancion) { this.cancion = cancion; }
}
