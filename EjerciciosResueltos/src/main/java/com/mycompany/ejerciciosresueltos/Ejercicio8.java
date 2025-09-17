package com.mycompany.ejerciciosresueltos;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Imp_06 - Mañana
 */


public class Ejercicio8 {
    public static void Ejer8() {
        Scanner leer = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", 
            "abril", "mayo", "junio","julio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre"};
        
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        //System.out.println("Inserta un mes en numero: ");
        //int mes = leer.nextInt();
        int mes;
        do {
            System.out.println("Inserta un mes en numero: ");
            mes = leer.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("No te sabes los meses");
            }
        } while(mes < 1 || mes > 12);
        System.out.println("El mes es: "+meses[mes-1]+ 
                " y tiene "+dias[mes-1]+" dias.");
        
    }
}