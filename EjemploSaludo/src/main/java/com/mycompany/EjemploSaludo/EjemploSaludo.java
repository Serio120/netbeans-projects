/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplosaludo;

import java.util.Scanner;

/**
 *
 * @author Imp_06 - Mañana
 */
public class EjemploSaludo {
    public static void saludar (String nombre) {
        System.out.print("Hola "+nombre);
    
    }
    
    public static String pedir () {
        Scanner s = new Scanner (System.in);
        System.out.print("Escribe un nombre para saludarte: ");
        String nombre = s.nextLine();
        return nombre;
    
    }
    
    public static void main (String[] args){
    saludar(pedir());
    }
    
}
