package com.ccristaldo.prueba;

import com.ccristaldo.prueba.domain.Persona;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class StartController {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        log.info("ejecutando controlador de inicio");
        var mensaje = "Hola mundo desde Spring MVC con Thymeleaf";

        var persona = new Persona();
        persona.setNombre("Carlos");
        persona.setApellido("Cristaldo");
        persona.setEmail("ccristaldo@mail.com");
        persona.setTelefono("3624942168");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        return "index";
    }
}
