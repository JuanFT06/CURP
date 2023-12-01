/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.dao;

import com.example.JFigueroaDrSecurity.jpa.Direccion;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author digis
 */
@Service
public class DireccionDAOImplementation {
    private final IDireccionDAO iDireccionDAO;

    public DireccionDAOImplementation(IDireccionDAO iDireccionDAO) {
        this.iDireccionDAO = iDireccionDAO;
    }
    
    public Direccion save(Direccion direccion){
        return this.iDireccionDAO.save(direccion);
    }
}
