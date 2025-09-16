/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopoo;

/**
 *
 * @author Imp_06 - Mañana
 */

public class EjercicioPOO {
    public static void main(String[] args) {
        // Crear cuenta con solo titular
        Cuenta cuenta1 = new Cuenta("Juan Pérez");
        System.out.println(cuenta1);  // Muestra titular y cantidad (0.0)

        // Ingresar dinero positivo
        cuenta1.ingresar(150.75);
        System.out.println("Después de ingresar 150.75: " + cuenta1);

        // Intentar ingresar cantidad negativa (no debería cambiar)
        cuenta1.ingresar(-50);
        System.out.println("Después de intentar ingresar -50: " + cuenta1);

        // Retirar una cantidad menor que la disponible
        cuenta1.retirar(100);
        System.out.println("Después de retirar 100: " + cuenta1);

        // Retirar una cantidad mayor que la disponible (debería quedar en 0)
        cuenta1.retirar(100);
        System.out.println("Después de retirar 100 más: " + cuenta1);

        // Crear cuenta con titular y cantidad inicial
        Cuenta cuenta2 = new Cuenta("Ana Gómez", 500);
        System.out.println(cuenta2);
    }
}