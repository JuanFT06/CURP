/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.restController;

import com.example.JFigueroaDrSecurity.dao.DireccionDAOImplementation;
import com.example.JFigueroaDrSecurity.dao.PersonaDAOImplementation;
import com.example.JFigueroaDrSecurity.jpa.Direccion;
import com.example.JFigueroaDrSecurity.jpa.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digis
 */
@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {

    @Autowired
    public PersonaRestController(PersonaDAOImplementation personaDAOImplementation,DireccionDAOImplementation direccionDAOImplementation) {
        this.personaDAOImplementation = personaDAOImplementation;
        this.direccionDAOImplementation=direccionDAOImplementation;
    }
    
    private final PersonaDAOImplementation personaDAOImplementation;
    private final DireccionDAOImplementation direccionDAOImplementation;
    
    @GetMapping("")
    public ResponseEntity<List<Persona>> getAll(){
        List<Persona> personas=this.personaDAOImplementation.getAll();
        return ResponseEntity.ok(personas);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id")int id){
        Persona persona=this.personaDAOImplementation.getById(id);
        
        return ResponseEntity.ok(persona);
    }
    
    @PostMapping("")
    public ResponseEntity<Persona> add(@RequestBody Persona persona){
        Direccion newDireccion=this.direccionDAOImplementation.save(persona.getDireccion());
        persona.setDireccion(newDireccion);
        Persona newPersona=this.personaDAOImplementation.save(persona);
        return ResponseEntity.status(201).body(newPersona);
        
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Persona> update(@PathVariable("id")int id,@RequestBody Persona persona){
        if (this.personaDAOImplementation.exist(id)) {
            persona.setId(id);
            Direccion newDireccion=this.direccionDAOImplementation.save(persona.getDireccion());
            Persona newPersona=this.personaDAOImplementation.save(persona);
            return ResponseEntity.status(201).body(newPersona);
        }
        return ResponseEntity.badRequest().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id")int id){
        if (this.personaDAOImplementation.exist(id)) {
            this.personaDAOImplementation.delete(id);
           return ResponseEntity.ok("eliminado");
        }
        return ResponseEntity.badRequest().build();
    }
}
