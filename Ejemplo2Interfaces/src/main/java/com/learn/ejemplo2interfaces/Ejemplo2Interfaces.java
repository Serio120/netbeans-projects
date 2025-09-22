/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.learn.ejemplo2interfaces;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Ejemplo2Interfaces {

    public static void main(String[] args) {
        // Instanciar un Coche (implementa ambas interfaces a través de Vehiculo)
        Coche miCoche = new Coche("ABC-123", "Rojo");
        
        // Probar directamente con el objeto Coche
        System.out.println("=== Prueba directa con Coche ===");
        miCoche.arrancar();  // Debería imprimir: "Arrancado Vehiculo"
        miCoche.parar();     // Debería imprimir: "Parando Coche"
        
        // Probar usando referencia a la interfaz IVehiculo1 (solo arrancar)
        System.out.println("\n=== Prueba con interfaz IVehiculo1 ===");
        IVehiculo1 vehiculo1 = miCoche;
        vehiculo1.arrancar();  // Funciona: "Arrancado Vehiculo"
        // vehiculo1.parar();  // Error de compilación: IVehiculo1 no tiene parar()
        
        // Probar usando referencia a la interfaz IVehiculo2 (solo parar)
        System.out.println("\n=== Prueba con interfaz IVehiculo2 ===");
        IVehiculo2 vehiculo2 = miCoche;
        // vehiculo2.arrancar();  // Error de compilación: IVehiculo2 no tiene arrancar()
        vehiculo2.parar();     // Funciona: "Parando Coche"
        
        // Probar con referencia al padre abstracto Vehiculo
        System.out.println("\n=== Prueba con clase abstracta Vehiculo ===");
        Vehiculo vehiculoAbstracto = miCoche;
        vehiculoAbstracto.arrancar();  // "Arrancado Vehiculo"
        vehiculoAbstracto.parar();     // "Parando Coche" (implementado en la subclase)
        
        System.out.println(miCoche.matricula + "Pruebas completadas. Matricula: " + ", Color: " + miCoche.color);
    }
}