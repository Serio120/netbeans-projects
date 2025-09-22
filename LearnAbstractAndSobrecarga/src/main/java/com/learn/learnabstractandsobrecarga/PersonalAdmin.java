/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.learnabstractandsobrecarga;

/**
 * @ learn mns
 * @author davinia
 */
public class PersonalAdmin extends Persona{
    private String departamento;

    public PersonalAdmin(String nombre, String apellidos, String dni, String departamento) {
        super(nombre, apellidos, dni);
        this.departamento = departamento;
    }
    
    public void resgitrarPrimerAcceso(){
        System.out.println("Acceso concedido y tu departamento va a ser "+departamento);
    }
    protected String emailBienvenida2(){
        return super.emailBienvenida2() + "personal de Adminitracion ";
    }
}
