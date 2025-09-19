/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosresueltos;

import java.util.Scanner;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Ejercicio8o2 {
    
    public static int pedirMes() {
        Scanner leer = new Scanner(System.in);
        int mes;
        do {
            System.out.println("Inserta un mes en numero: ");
            mes = leer.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("No te sabes los meses");
            }
        } while(mes < 1 || mes > 12);

        return mes;
    }
    public static String mostrarDatosMes(int mes){
        final String[] MESES = {"enero", "febrero", "marzo", 
            "abril", "mayo", "junio","julio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre"};
     
        switch(mes){
            case 2: 
                return "El mes es: "+MESES[mes-1] 
                        + " y tiene 28 dias";
            case 4:
            case 6:
            case 9:
            case 11:
                return "El mes es: "+MESES[mes-1] 
                        + " y tiene 30 dias";
            default:
                return "El mes es: "+MESES[mes-1] 
                        + " y tiene 31 dias";
                          
                
        }
       
    }
    public static void ejer8o2() { 
        
        int mes = pedirMes();
        System.out.println(mostrarDatosMes(mes));    
        
    }
}