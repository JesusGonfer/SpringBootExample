package com.jesusgonfer.backend.controllers;

import com.jesusgonfer.backend.models.Persona;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin
public class HomeController {

    @GetMapping(value="/persona", produces=MediaType.APPLICATION_JSON_VALUE) //text/xml
    public Persona getPersona() {
        Persona p  = new Persona();

        p.setAltura(1.5);
        p.setEdad(40);
        p.setNombre("RAfael");

        return p;
    }
    
    @PostMapping(value="/postTest", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String postPruebaTest(@RequestBody Persona persona){


        return persona.getNombre() + "|" + persona.getEdad() + "|" + persona.getAltura();
    }
    
}