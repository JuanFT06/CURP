/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.dao;

import com.example.JFigueroaDrSecurity.jpa.Colonia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digis
 */
@Service
public class ColoniaDAOImplementation {
    
    private final IColoniaDAO iColoniaDAO;

    @Autowired
    public ColoniaDAOImplementation(IColoniaDAO iColoniaDAO) {
        this.iColoniaDAO = iColoniaDAO;
    }
    
    public List<Colonia> getAll(int id){
        return this.iColoniaDAO.findAllByMunicipioId(id);
    }
    
}
