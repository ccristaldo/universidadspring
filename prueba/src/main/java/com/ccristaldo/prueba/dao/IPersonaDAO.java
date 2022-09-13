package com.ccristaldo.prueba.dao;

import com.ccristaldo.prueba.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDAO extends CrudRepository<Persona, Long> {
}
