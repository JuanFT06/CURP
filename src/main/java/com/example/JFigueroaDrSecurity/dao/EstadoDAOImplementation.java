/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.dao;

import com.example.JFigueroaDrSecurity.jpa.Estado;
import com.example.JFigueroaDrSecurity.dao.IEstadoDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digis
 */
@Service
public class EstadoDAOImplementation {

    @Autowired
    public EstadoDAOImplementation(IEstadoDAO iEstadoDAO) {
        this.iEstadoDAO = iEstadoDAO;
    }
    private final IEstadoDAO iEstadoDAO;
    
    public List<Estado> getAll(){
        return this.iEstadoDAO.findAll();
    }
}
