/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.restController;

import com.example.JFigueroaDrSecurity.jpa.Estado;
import com.example.JFigueroaDrSecurity.dao.EstadoDAOImplementation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digis
 */
@RestController
@RequestMapping("/api/estados")
public class EstadoRestController {

    @Autowired
    public EstadoRestController(com.example.JFigueroaDrSecurity.dao.EstadoDAOImplementation estadoDAOImplementation) {
        this.estadoDAOImplementation = estadoDAOImplementation;
    }
    private final EstadoDAOImplementation estadoDAOImplementation;
    
    @GetMapping("")
    public ResponseEntity<List<Estado>> getAll(){
        List<Estado> estados=this.estadoDAOImplementation.getAll();
        return ResponseEntity.ok(estados);
    }
}
