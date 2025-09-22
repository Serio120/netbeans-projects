/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.ejemplointerface;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Vehiculo implements IVehiculo {
    protected String matricula;
    
    public Vehiculo(String matricula) {
        super();
        this.matricula = matricula;
    }
    
    @Override
    public void arrancar(){
        System.out.println("Arrancar Vehiculo");
    }
    
}
