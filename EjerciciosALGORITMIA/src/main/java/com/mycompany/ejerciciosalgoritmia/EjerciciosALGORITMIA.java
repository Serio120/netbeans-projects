/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosalgoritmia;
import java.util.Scanner;

/**
 *
 * @author Imp_06 - Mañana
 */
public class EjerciciosALGORITMIA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú de Ejercicios ---");
            System.out.println("1 - Menor de tres números");
            System.out.println("2 - Contar letra en frase");
            System.out.println("3 - Sumar o restar dos números reales");
            System.out.println("4 - Validar usuario y contraseña");
            System.out.println("5 - Mostrar número según letra");
            System.out.println("6 - Ordenar 7 palabras alfabéticamente");
            System.out.println("7 - Comprobar hora válida");
            System.out.println("8 - Días y nombre del mes");
            System.out.println("9 - Contar negativos y ceros");
            System.out.println("10 - Invertir número");
            System.out.println("0 - Salir");
            System.out.print("Elige un ejercicio (0-10): ");

            int opcion = -1;
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer
            } else {
                System.out.println("Entrada no válida. Intenta de nuevo.");
                sc.nextLine(); // limpiar buffer
                continue;
            }

            switch (opcion) {
                case 1:
                    MisEjercicios.ejercicio1();
                    break;
                case 2:
                    MisEjercicios.ejercicio2();
                    break;
                case 3:
                    MisEjercicios.ejercicio3();
                    break;
                case 4:
                    MisEjercicios.ejercicio4();
                    break;
                case 5:
                    MisEjercicios.ejercicio5();
                    break;
                case 6:
                    MisEjercicios.ejercicio6();
                    break;
                case 7:
                    MisEjercicios.ejercicio7();
                    break;
                case 8:
                    MisEjercicios.ejercicio8();
                    break;
                case 9:
                    MisEjercicios.ejercicio9();
                    break;
                case 10:
                    MisEjercicios.ejercicio10();
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            if (!salir) {
                System.out.println("\nPulsa Enter para continuar...");
                sc.nextLine();
            }
        }

        sc.close();
    }
}