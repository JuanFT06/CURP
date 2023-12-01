/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.dao;

import com.example.JFigueroaDrSecurity.jpa.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digis
 */
@Service
public class PersonaDAOImplementation {

    @Autowired
    public PersonaDAOImplementation(com.example.JFigueroaDrSecurity.dao.IPersonaDAO iPersonaDAO) {
        this.iPersonaDAO = iPersonaDAO;
    }
    
    private final IPersonaDAO iPersonaDAO;
  
    
    public List<Persona> getAll(){
        return this.iPersonaDAO.findAll();
    }
    
    public Persona getById(int id){
        return this.iPersonaDAO.findById(id).orElse(null);
    }
    
    public Persona save(Persona persona){
        return this.iPersonaDAO.save(persona);
    }
    
    public boolean exist(int id){
        return this.iPersonaDAO.existsById(id);
    }
    
    public void delete(int id){
        this.iPersonaDAO.deleteById(id);
    }
}
