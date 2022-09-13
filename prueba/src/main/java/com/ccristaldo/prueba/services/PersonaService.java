package com.ccristaldo.prueba.services;

import com.ccristaldo.prueba.domain.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> getAll();

    public void save(Persona persona);

    public void delete(Persona persona);

    public Persona findOne(Persona persona);

}
