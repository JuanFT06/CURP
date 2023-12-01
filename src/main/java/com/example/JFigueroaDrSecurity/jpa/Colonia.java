/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JFigueroaDrSecurity.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author digis
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Colonia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcolonia")
    private int id;
    
    private String nombre;
    
    private String ciudad;
    
    private String asentamiento;
    
    @Column(name = "codigopostal")
    private String codigoPostal;

    @ManyToOne
    @JoinColumn(name = "idmunicipio" )
    private Municipio municipio;
}
