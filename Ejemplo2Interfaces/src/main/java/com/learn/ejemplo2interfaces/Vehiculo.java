/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.ejemplo2interfaces;

/**
 *
 * @author Imp_06 - Mañana
 */
public abstract class Vehiculo implements IVehiculo1, IVehiculo2{
	protected String matricula;

	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}

	public void arrancar(){
        System.out.println("Arrancado Vehiculo");
    }
    public abstract void parar();
}
