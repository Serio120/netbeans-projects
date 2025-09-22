/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.learnabstractandsobrecarga;

/**
 * @ learn mns
 * @author davinia
 */
public class Alumno extends Persona{
    private String nExpediente;
    private double[] notas;

    public Alumno(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
    }

    public Alumno(String nombre, String apellidos, String dni, String nExpediente) {
        super(nombre, apellidos, dni);
        this.nExpediente = nExpediente;
    }
    public void resgitrarPrimerAcceso(){
        System.out.println("Acceso concedido y tu numero de expediente va a ser: "+ nExpediente);
    }
    public void emailBienvenida(){
        System.out.println("Bienvenid@ nuev@ alumn@");
    }
    protected String emailBienvenida2(){
        return super.emailBienvenida2() + "alumn@";
    }
}
