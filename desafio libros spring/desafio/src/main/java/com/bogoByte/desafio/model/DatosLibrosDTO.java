package com.bogoByte.desafio.model;

import java.util.List;

public record DatosLibrosDTO(
        String titulo,
        List<String> autores,
        List<String> idiomas,
        Double numeroDeDescargas
) {}