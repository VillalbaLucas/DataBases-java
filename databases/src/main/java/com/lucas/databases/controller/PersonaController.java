package com.lucas.databases.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lucas.databases.Entity.Persona;
import com.lucas.databases.service.IpersonaService;


@Controller
@RequestMapping
public class PersonaController {
    
    @Autowired
    private IpersonaService service;
    
    @GetMapping("")
    public String listaPersonas(ModelMap modelo) {
        modelo.addAttribute("personas", service.listarPersona());
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("persona", new Persona());
        return"form";
    }

    @PostMapping("/save")
    public String save(@Valid Persona p){
        service.save(p);
        return "redirect:/";
    }

    //@DeleteMapping("/")  
}
