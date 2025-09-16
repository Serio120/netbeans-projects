/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebalaburbuja;

/**
 *
 * @author Imp_06 - Mañana
 */
public class PruebaLaBurbuja {

    public static void main(String[] args) {
        int[] a = {3, -1, 7, 0, 4};

        // Mostrar arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(a);

        // Aplicar algoritmo de la burbuja
        burbuja(a);

        // Mostrar arreglo ordenado
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(a);
    }

    public static void burbuja(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Intercambiar a[j] y a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            // Mostrar arreglo después de cada pasada
            System.out.print("Después de la pasada " + (i + 1) + ": ");
            imprimirArreglo(a);
        }
    }

    public static void imprimirArreglo(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}