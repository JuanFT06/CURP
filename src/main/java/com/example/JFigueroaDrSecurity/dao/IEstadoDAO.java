/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.JFigueroaDrSecurity.dao;

import com.example.JFigueroaDrSecurity.jpa.Estado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

/**
 *
 * @author digis
 */
public interface IEstadoDAO extends JpaRepository<Estado, Integer>{

}
