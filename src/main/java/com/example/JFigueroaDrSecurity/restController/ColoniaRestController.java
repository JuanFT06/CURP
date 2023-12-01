/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.restController;

import com.example.JFigueroaDrSecurity.dao.ColoniaDAOImplementation;
import com.example.JFigueroaDrSecurity.jpa.Colonia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digis
 */
@RestController
@RequestMapping("/api/colonias")
public class ColoniaRestController {
    private final ColoniaDAOImplementation coloniaDAOImplementation;

    @Autowired
    public ColoniaRestController(ColoniaDAOImplementation coloniaDAOImplementation) {
        this.coloniaDAOImplementation = coloniaDAOImplementation;
    }
    
    @GetMapping("")
    public ResponseEntity<List<Colonia>> getAll(@RequestParam("idmunicipio")int id){
        List<Colonia> colonias=this.coloniaDAOImplementation.getAll(id);
        return ResponseEntity.ok(colonias);
    }
}
