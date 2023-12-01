/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.dao;

import com.example.JFigueroaDrSecurity.jpa.Municipio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digis
 */
@Service
public class MunicipioDAOImplementation {
    private final IMunicipioDAO iMunicipioDAO;

    @Autowired
    public MunicipioDAOImplementation(IMunicipioDAO iMunicipioDAO) {
        this.iMunicipioDAO = iMunicipioDAO;
    }
    
    public List<Municipio> getAll(int id){
        return this.iMunicipioDAO.findAllByEstadoId(id);
    }
}
