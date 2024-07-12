package com.bogoByte.desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record DatosAutorRecord(

        @JsonAlias ("name") String nombre,
        @JsonAlias ("birth_year") String fechaDeNacimiento
) {
}
