/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.ejemplo2interfaces;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Coche extends Vehiculo{
	String color;

	public Coche(String matricula, String color) {
		super(matricula);
		this.color = color;
	}

	public void parar() {
        //super.arrancar();
		System.out.println("Parando Coche");

	}

}

