/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopassword;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Imp_06 - Mañana
 */

public class EjercicioPASSWORD {
    public static void main(String[] args) {
        // Pedimos tamaño del array
        try (Scanner sc = new Scanner(System.in)) {
            // Pedimos tamaño del array
            System.out.print("Introduce el tamaño del array de Passwords: ");
            int tamaño = sc.nextInt();
            
            // Pedimos longitud de las contraseñas
            System.out.print("Introduce la longitud de las contraseñas: ");
            int longitud = sc.nextInt();
            
            // Creamos array original de Passwords
            Password[] passwords = new Password[tamaño];
            
            // Creamos cada objeto Password con la longitud indicada
            for (int i = 0; i < tamaño; i++) {
                passwords[i] = new Password(longitud);
            }
            
            // Creamos array de copias
            Password[] copias = new Password[tamaño];
            for (int i = 0; i < tamaño; i++) {
                copias[i] = new Password(passwords[i]); // constructor copia
            }
            
            // Ordenamos alfabéticamente el array de copias
            Arrays.sort(copias);
            
            // Mostramos array de copias ordenado
            System.out.println("\nContraseñas ordenadas:");
            for (Password p : copias) {
                System.out.println(p);
            }
            
            // Creamos array booleano para saber si cada contraseña original es fuerte
            boolean[] fuertes = new boolean[tamaño];
            for (int i = 0; i < tamaño; i++) {
                fuertes[i] = passwords[i].esFuerte();
            }
            
            // Mostramos contraseña y si es fuerte o no
            System.out.println("\nTodas las contraseñas con su estado de fortaleza:");
            for (int i = 0; i < tamaño; i++) {
                System.out.println(passwords[i].getContraseña() + " " + fuertes[i]);
            }
        }
    }
}
