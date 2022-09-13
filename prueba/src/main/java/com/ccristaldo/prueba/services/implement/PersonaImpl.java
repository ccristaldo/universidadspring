package com.ccristaldo.prueba.services.implement;

import com.ccristaldo.prueba.dao.IPersonaDAO;
import com.ccristaldo.prueba.domain.Persona;
import com.ccristaldo.prueba.services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaImpl implements PersonaService {

    private final IPersonaDAO iPersonaDAO;

    public PersonaImpl(IPersonaDAO iPersonaDAO) {
        this.iPersonaDAO = iPersonaDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Persona> getAll() {
        return (List<Persona>) iPersonaDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Persona persona) {
        iPersonaDAO.save(persona);
    }

    @Override
    @Transactional
    public void delete(Persona persona) {
        iPersonaDAO.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findOne(Persona persona) {
        return iPersonaDAO.findById(persona.getId_persona()).orElse(null);
    }
}
