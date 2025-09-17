/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosalgoritmia;
import java.util.Scanner;


/**
 *
 * @author Imp_06 - Mañana
 */
public class MisEjercicios {
    
    // 1 - Indicar el menor de tres números enteros
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres numeros enteros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.println("El numero menor es: " + menor);
    }

    // 2 - Contar cuántas veces aparece una letra en una frase
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        System.out.println("Introduce una letra:");
        char letra = sc.nextLine().charAt(0);

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
    }

    // 3 - Sumar o restar dos números reales según elección del usuario
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero real:");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero real:");
        double num2 = sc.nextDouble();
        System.out.println("Elige operacion: 1 para suma, 2 para resta");
        int opcion = sc.nextInt();

        if (opcion != 1) if (opcion == 2) {
            System.out.println("Resultado de la resta: " + (num1 - num2));
        } else {
            System.out.println("Opcion no valida.");
        } else {
            System.out.println("Resultado de la suma: " + (num1 + num2));
        }
    }

    // 4 - Validar usuario y contraseña con 3 intentos
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";

        int intentos = 3;
        boolean acceso = false;

        while (intentos > 0 && !acceso) {
            System.out.println("Introduce usuario:");
            String usuario = sc.nextLine();
            System.out.println("Introduce contrasena:");
            String contrasena = sc.nextLine();

            if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Acceso concedido.");
                acceso = true;
            } else {
                intentos--;
                System.out.println("Usuario o contrasena incorrectos. Intentos restantes: " + intentos);
            }
        }
        if (!acceso) {
            System.out.println("Acceso denegado.");
        }
    }

    // 5 - Mostrar número según letra introducida
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra:");
        char letra = sc.nextLine().charAt(0);

        switch (letra) {
            case 'a' -> System.out.println(7);
            case 'b' -> System.out.println(9);
            case 'c' -> System.out.println(101);
            default -> System.out.println("Se ha equivocado de letra.");
        }
    }

    // 6 - Ordenar alfabéticamente un array con 7 palabras usando burbuja
    public static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[7];
        System.out.println("Introduce 7 palabras:");
        for (int i = 0; i < 7; i++) {
            palabras[i] = sc.nextLine();
        }

        // Algoritmo burbuja
        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = 0; j < palabras.length - 1 - i; j++) {
                if (palabras[j].compareToIgnoreCase(palabras[j + 1]) > 0) {
                    String temp = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j + 1] = temp;
                }
            }
        }

        System.out.println("Palabras ordenadas alfabeticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    // 7 - Comprobar si una hora es válida (24h, minutos y segundos 0-59)
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce hora (H):");
        int H = sc.nextInt();
        System.out.println("Introduce minutos (M):");
        int M = sc.nextInt();
        System.out.println("Introduce segundos (S):");
        int S = sc.nextInt();

        boolean horaValida = (H >= 0 && H < 24) && (M >= 0 && M <= 59) && (S >= 0 && S <= 59);

        if (horaValida) {
            System.out.println("La hora es valida.");
        } else {
            System.out.println("La hora no es valida.");
        }
    }

    // 8 - Indicar días y nombre del mes según número
    public static void ejercicio8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de mes (1-12):");
        int mes = sc.nextInt();

        String nombreMes;
        int dias;

        switch (mes) {  // cases sin break
            case 1 -> {
                nombreMes = "Enero"; dias = 31;
            }
            case 2 -> {
                nombreMes = "Febrero"; dias = 28;
            }
            case 3 -> {
                nombreMes = "Marzo"; dias = 31;
            }
            case 4 -> {
                nombreMes = "Abril"; dias = 30;
            }
            case 5 -> {
                nombreMes = "Mayo"; dias = 31;
            }
            case 6 -> {
                nombreMes = "Junio"; dias = 30;
            }
            case 7 -> {
                nombreMes = "Julio"; dias = 31;
            }
            case 8 -> {
                nombreMes = "Agosto"; dias = 31;
            }
            case 9 -> {
                nombreMes = "Septiembre"; dias = 30;
            }
            case 10 -> {
                nombreMes = "Octubre"; dias = 31;
            }
            case 11 -> {
                nombreMes = "Noviembre"; dias = 30;
            }
            case 12 -> {
                nombreMes = "Diciembre"; dias = 31;
            }
            default -> {
                System.out.println("Numero de mes no valido.");
                return;
            }
        }

        System.out.println(nombreMes + " tiene " + dias + " días.");
    }

    // 9 - Contar números negativos y ceros hasta que se introduce -25
    public static void ejercicio9() {
        Scanner sc = new Scanner(System.in);
        int negativos = 0;
        int ceros = 0;
        int num;

        System.out.println("Introduce numeros enteros (termina con -25):");
        while (true) {
            num = sc.nextInt();
            if (num == -25) break;
            if (num < 0) negativos++;
            if (num == 0) ceros++;
        }

        System.out.println("Numeros negativos introducidos: " + negativos);
        System.out.println("Numeros ceros introducidos: " + ceros);
    }

    // 10 - Invertir el orden de las cifras de un número entero positivo
    public static void ejercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo:");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Numero no valido.");
            return;
        }

        int invertido = 0;
        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        System.out.println("Numero invertido: " + invertido);
    }

    public static void main(String[] args) {
        // Llamar aquí a cada ejercicio para probarlo, por ejemplo:
        // ejercicio1();
        // ejercicio2();
        // ...
    }
}