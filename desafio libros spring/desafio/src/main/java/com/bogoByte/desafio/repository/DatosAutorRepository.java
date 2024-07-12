package com.bogoByte.desafio.repository;

import com.bogoByte.desafio.model.DatosAutor;
import com.bogoByte.desafio.model.DatosAutorRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatosAutorRepository extends JpaRepository<DatosAutor, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
