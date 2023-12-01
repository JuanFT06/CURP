/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.restController;

import com.example.JFigueroaDrSecurity.dao.MunicipioDAOImplementation;
import com.example.JFigueroaDrSecurity.jpa.Municipio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digis
 */
@RestController
@RequestMapping("/api/municipios")
public class MunicipioRestController {
    private final MunicipioDAOImplementation municipioDAOImplementation;

    @Autowired
    public MunicipioRestController(MunicipioDAOImplementation municipioDAOImplementation) {
        this.municipioDAOImplementation = municipioDAOImplementation;
    }
    
    @GetMapping("")
    public ResponseEntity<List<Municipio>> getAll(@RequestParam("idestado")int id){
        List<Municipio> municipios=this.municipioDAOImplementation.getAll(id);
        return ResponseEntity.ok(municipios);
    }
    
}
