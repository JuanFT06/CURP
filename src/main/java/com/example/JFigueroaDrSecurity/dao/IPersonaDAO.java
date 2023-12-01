/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.JFigueroaDrSecurity.dao;

import com.example.JFigueroaDrSecurity.jpa.Persona;
import org.springframework.data.repository.ListCrudRepository;

/**
 *
 * @author digis
 */
public interface IPersonaDAO extends ListCrudRepository<Persona, Integer>{
    
}
