package com.example.bootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServicioCiudades {

    @Autowired
    private CiudadRepository ciudadRepository;

    @GetMapping(value = "/datos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ciudad> datosCiudades() {
        return ciudadRepository.findAll();
    }
}
