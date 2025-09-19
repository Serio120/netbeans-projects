/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author davinia
 */
public class Persona {
    private String numDni;
    private char letraDni;
    private String dni;
    
    public Persona(){
        this.numDni = generarNDni();
        this.letraDni = generarLetraDni();
        dni = numDni+letraDni;
    }

    public String getDni() {
        return dni;
    }
    
    private String generarNDni(){
        return "11111111";
    }
    private char generarLetraDni(){
        return 'A';
    }
    
}
