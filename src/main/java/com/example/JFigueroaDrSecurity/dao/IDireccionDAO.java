/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.JFigueroaDrSecurity.dao;

import com.example.JFigueroaDrSecurity.jpa.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digis
 */
public interface IDireccionDAO extends JpaRepository<Direccion, Integer>{
    
}
