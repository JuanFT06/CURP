/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.JFigueroaDrSecurity.dao;

import com.example.JFigueroaDrSecurity.jpa.Colonia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digis
 */
public interface IColoniaDAO extends JpaRepository<Colonia, Integer>{
    List<Colonia> findAllByMunicipioId(int id);
}
    
    

