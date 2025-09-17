/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosresueltos;

/**
 *
 * @author Imp_06 - Mañana
 */
public class EjercicioPOO {
    

    public static void principal() {
        Cuenta c1 = new Cuenta("Maria");
        System.out.println(c1);
        c1.ingresar(344.27);
        System.out.println(c1.getCantidad());
        c1.retirar(20);
        System.out.println(c1.getCantidad());
    }
}