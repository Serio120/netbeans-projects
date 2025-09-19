/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.learnabstractandsobrecarga;

/**
 * @ learn mns
 * @author davinia
 */
public class Profesor extends Persona{
    private double sueldo;
    private String email;//String cadena; String cadena2 = ""; A1234F

    public Profesor(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
        email= "Sin email aun";
    }
    
    public Profesor(String nombre, String apellidos, String dni, String email) {
        super(nombre, apellidos, dni);
        this.email= email;
    }
    public Profesor(String nombre, String apellidos, String dni, String email, double sueldo) {
        super(nombre, apellidos, dni);
        this.email= email;
        this.sueldo = sueldo;
    }
    public void resgitrarPrimerAcceso(){
        System.out.println("Acceso concedido y tu sueldo va a ser: "+sueldo);
    } 
     protected String emailBienvenida2(){
        return super.emailBienvenida2() + "profesor/a";
    }
    
}
