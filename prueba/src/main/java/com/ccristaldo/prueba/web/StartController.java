package com.ccristaldo.prueba.web;

import com.ccristaldo.prueba.dao.IPersonaDAO;
import com.ccristaldo.prueba.domain.Persona;
import com.ccristaldo.prueba.services.PersonaService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
@Log4j2
public class StartController {

    private final PersonaService personaService;

    public StartController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/")
    public String inicio(Model model){
        log.info("ejecutando controlador de inicio");

        var personas = personaService.getAll();

        model.addAttribute("personas", personas);

        return "index";
    }
}
