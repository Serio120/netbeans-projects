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

public class Ejercicio10 {

    public static int nCifras(int n) {
        int cont = 0;
        while (n / 10 > 0) {
            cont++;
            n = n / 10;
        }
        return cont + 1;
    }

    public static int multX10(int r, int veces) {
        for (int i = 0; i < veces; i++) {
            r *= 10; //r = r * 10
        }
        return r;
    }

    public static int invertir(int n) {
        int cont = 1;
        int cifras = nCifras(n);
        int r; //4321
        int rFinal = 0;
        for (int i = 0; i < cifras; i++) {
            r = n % 10;//i = 0, r = 4, i=1 r=3
            n = n / 10;
            //i=0 rFinal = 4000
            //i=1 rFinal=4000+300 
            rFinal = rFinal + multX10(r, cifras - cont);
            cont++;
        }
        /* int r = n%10;//4
        r = multX10(r,nCifras(n)-1);
        int r2 = (n/10)%10; //3 
        r2 = multX10(r2,nCifras(n)-2);
        int r3 = ((n/10)/10)%10; //2
        r3 = multX10(r3,nCifras(n)-3);
        int r4 = (((n/10)/10)/10)%10; //1
        r4 = multX10(r4,nCifras(n)-4);
        return (r+r2+r3+r4);*/
        return rFinal;
    }

    public static void ejer10() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserta un numero: ");
        int n = leer.nextInt();
        /*System.out.println(n%10);//1234 => 1234%10 = 4
        //1234 => n/10 = 123 (n/10)%10 = 3
        //1234 % 100 = 34 
        //x%y => [0, (y-1)] 
        System.out.println((n/10)%10);
        System.out.println(((n/10)/10)%10);
        System.out.println((((n/10)/10)/10)%10);*/
        System.out.println(invertir(n));
    }
}