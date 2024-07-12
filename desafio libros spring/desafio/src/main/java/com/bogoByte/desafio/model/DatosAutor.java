package com.bogoByte.desafio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatosAutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String fechaDeNacimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "datos_libros_id")
    private DatosLibros datosLibros;

    // Constructor sin argumentos requerido por JPA
    public DatosAutor() {
    }

    // Constructor que acepta un DatosAutorRecord
    public DatosAutor(DatosAutorRecord datosAutorRecord) {
        this.nombre = datosAutorRecord.nombre();
        this.fechaDeNacimiento = datosAutorRecord.fechaDeNacimiento();
    }

}
