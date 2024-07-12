package com.bogoByte.desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;

import java.util.List;
import java.util.stream.Collectors;

@Entity
public class DatosLibros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonAlias("title")
    private String titulo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "datosLibros")
    @JsonAlias("authors")
    private List<DatosAutor> autores;

    @JsonAlias("languages")
    @ElementCollection
    private List<String> idiomas;

    @JsonAlias("download_count")
    private Double numeroDeDescargas;

    public DatosLibros() {
    }

    public DatosLibros(DatosLibrosDTO datosLibrosDTO, List<DatosAutor> autoresList) {
        this.titulo = datosLibrosDTO.titulo();
        this.autores = autoresList;
        this.idiomas = datosLibrosDTO.idiomas();
        this.numeroDeDescargas = datosLibrosDTO.numeroDeDescargas();
    }

    // Getters y setters omitidos por brevedad
}