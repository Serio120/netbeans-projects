/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poodavinia;

/**
 *
 * @author Imp_06 - Mañana
 */

public class Vehiculo {

    //Atributos
    private String color;
    private int nRuedas;
    private String matricula;
    //Metodos    
    //Constructores
    //Constructor por defecto
    public Vehiculo(){
       color = "Blanco"; 
       nRuedas = 4;
       matricula="SIN_MATRICULAR";
    }
    /* No se puede implementar porque ya tengo uno
    por defecto
    public Vehiculo(){
        color = "Rojo";
    }*/
    
    //Sobrecargados 
    public Vehiculo(String color){
        this.color = color;
        nRuedas = 4;
        matricula="SIN_MATRICULAR";
    }
    public Vehiculo(String color, String matricula){
        this.color = color;
        nRuedas = 4;
        this.matricula = matricula; 
    }
    public Vehiculo(int nRuedas, String matricula){
        color = "Blanco";
        this.nRuedas = nRuedas;
        this.matricula = matricula; 
    }
    public Vehiculo(String color, int nRuedas, String matricula){
        this.color = color;
        this.nRuedas = nRuedas;
        this.matricula = matricula; 
    }
    //De copia 
    public Vehiculo(Vehiculo v){
        this.color = v.color;
        this.nRuedas = v.nRuedas;
        this.matricula = v.matricula;
    }
    
     //Get
    public String getColor() {
        return color;
    }

    public int getNRuedas() {
        return nRuedas;
    }

    public String getMatricula() {
        return matricula;
    }
    //Set
    public void setColor(String color){
        this.color = color;
    }
    public void setNRuedas(int nRuedas){
        this.nRuedas = nRuedas;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    //toString
    public String toString(){
        return "Color: "+color
              +"\nNRuedas: "+nRuedas
              +"\nMatricula: "+matricula;
    }
    
    public void mostrarColor() {
        System.out.println("Este vehiculo es " + color);
    }
    
}