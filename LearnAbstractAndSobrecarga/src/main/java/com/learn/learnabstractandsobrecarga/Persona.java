/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.learn.learnabstractandsobrecarga;

/**
 * @ learn mns
 * @author davinia
 */
public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected String dni;
    /*protected Persona() {
        this.nombre = "nombre";
        this.apellidos = "apellidos";
        this.dni = "dni";
    }*/
    protected Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    protected abstract void resgitrarPrimerAcceso();
    
    protected void emailBienvenida(){
        System.out.println("Bienvenid@ nuev@ emplead@");
    } 
    protected String emailBienvenida2(){
        return "Bienvenid@ nuev@ ";
    }
}
