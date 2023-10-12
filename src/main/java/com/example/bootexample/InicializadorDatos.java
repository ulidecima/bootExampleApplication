package com.example.bootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InicializadorDatos implements CommandLineRunner {
    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public void run(String... args) throws Exception {
        ciudadRepository.save(new Ciudad("Junin", 20.0));
        ciudadRepository.save(new Ciudad("Chacabuco", 19.0));
        ciudadRepository.save(new Ciudad("Bragado", 2.0));
        ciudadRepository.save(new Ciudad("Rojas", 50.0));
        ciudadRepository.save(new Ciudad("Chivilcoy", 11.0));
    }
}
