package com.bogoByte.desafio.repository;

import com.bogoByte.desafio.model.DatosLibros;
import com.bogoByte.desafio.model.DatosLibrosDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<DatosLibros, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}