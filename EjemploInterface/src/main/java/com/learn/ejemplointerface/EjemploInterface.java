/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.learn.ejemplointerface;

/**
 *
 * @author Imp_06 - Mañana
 */
public class EjemploInterface {

    public static void main(String[] args) {
        System.out.println("==== PROBANDO INTERFACE ======");

        // Crear una instancia de Vehiculo (que implementa IVehiculo)
        IVehiculo miVehiculo = new Vehiculo("ABC-123");  // Usando la interfaz para polimorfismo

        // Llamar al método de la interfaz
        miVehiculo.arrancar();  // Debería imprimir: "Arrancado Vehiculo"

        System.out.println("Prueba completada. Matricula: " + ((Vehiculo) miVehiculo).matricula);
    }
}
