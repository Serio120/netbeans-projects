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
public class Ejercicio7 {

    public static void ejer7() {
        //"14:132:134"  -> Sería otra forma de pedirlo
        int h, m, s;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Inserta la hora: ");
            h = leer.nextInt();
            if(h<0){
                System.out.println("Tienes que darme un numero positivo");
            }
        } while (h < 0);
        do {
            System.out.println("Inserta los minutos: ");
            m = leer.nextInt();
            if(m<0){
                System.out.println("Tienes que darme un numero positivo");
            }
        } while (m < 0);
        do{
            System.out.println("Inserta los segundos: ");
            s = leer.nextInt();
            if(s<0){
                System.out.println("Tienes que darme un numero positivo");
            }
        } while (s < 0);
        if (h >= 0 && h < 24) {
            System.out.println("hora bien");
            if (m >= 0 && m <= 59) {
                System.out.println("minutos bien");
                if (s >= 0 && s <= 59) {
                    System.out.println("segundos bien");
                } else {
                    System.out.println("segundos no bien");
                }
            } else {
                System.out.println("minutos no bien");
                if (s >= 0 && s <= 59) {
                    System.out.println("segundos bien");
                } else {
                    System.out.println("segundos no bien");
                }
            }
        } else {
            System.out.println("hora no bien");
            if (m >= 0 && m <= 59) {
                System.out.println("minutos bien");
                if (s >= 0 && s <= 59) {
                    System.out.println("segundos bien");
                } else {
                    System.out.println("segundos no bien");
                }
            } else {
                System.out.println("minutos no bien");
                if (s >= 0 && s <= 59) {
                    System.out.println("segundos bien");
                } else {
                    System.out.println("segundos no bien");
                }
            }
        }

    }
}
