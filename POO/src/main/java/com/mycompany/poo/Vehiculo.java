/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Vehiculo {
    // Atributos privados
    private String color;
    private int nRuedas;
    private String matricula;
    
    //Constructores
    public Vehiculo(){
        color = "Blanco";
        nRuedas = 4;
        matricula = "SIN MATRICULAR";
    }
    
    //Sobrecargados
    public Vehiculo (String color, String matricula){
        this.color = color; //this es un puntero
        nRuedas = 4;
        this.matricula = matricula;
    
    }
    
    public Vehiculo (int nRuedas, String matricula){
        this.color = "blanco";
        this.nRuedas = 4;
        this.matricula = matricula;
    }
    
    //De Copia
    public Vehiculo(Vehiculo v) {
    
    }
    
    // Los métodos los ponemos públicos
    public void mostrarColor(){
        System.out.println("Este vehiculo es "+color);
    }
    
    
    //***                                    ***//
    public String toString() {
        return "Color: "+color
                +"\nRuedas: "+nRuedas
                +"\nMatricula: "+nRuedas
    
    }
}

