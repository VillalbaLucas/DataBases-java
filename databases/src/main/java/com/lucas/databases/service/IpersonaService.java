package com.lucas.databases.service;

import java.util.List;

import com.lucas.databases.Entity.Persona;

public interface IpersonaService {
    public List<Persona> listarPersona();
    public void save(Persona p);
}
