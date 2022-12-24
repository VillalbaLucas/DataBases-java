package com.lucas.databases.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.databases.Entity.Persona;
import com.lucas.databases.repository.Ipersona;

@Service
public class PersonaService implements IpersonaService{
    
    @Autowired
    private Ipersona persona;

     @Override
     public List<Persona> listarPersona() {
          return (List<Persona>) persona.findAll();
     }
     @Override
     public void save(Persona p) {
          persona.save(p);
     }
}
