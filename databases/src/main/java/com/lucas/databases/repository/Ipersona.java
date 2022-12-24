package com.lucas.databases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.databases.Entity.Persona;

@Repository
public interface Ipersona extends JpaRepository<Persona, Integer> {

}
