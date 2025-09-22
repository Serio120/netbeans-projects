/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.ejerciciocorralparadigma;

/**
 *
 * @author Imp_06 - Mañana
 */
/**
 * Representa el corral que contiene a todos los animales y gestiona la simulación.
 */
public class Corral {
    private Animal[] animales;

    /**
     * Constructor que inicializa el corral con un conjunto predefinido de animales.
     */
    public Corral() {
        animales = new Animal[] {
            new Gallina("Federica"),
            new Gallina("Manuela"),
            new Perro("Blacky"),
            new Perro("Dirty"),
            new Gato("Tonet")
        };
    }

    /**
     * Ejecuta la simulación de un día completo, hora por hora.
     */
    public void simulaUnDia() {
        for (int hora = 0; hora < 24; hora++) {
            System.out.println("---------- " + hora + " h ---------------------");
            for (Animal animal : animales) {
                // Polimorfismo en acción: cada 'animal' ejecutará su propia
                // versión de 'viveUnaHora'.
                animal.viveUnaHora(hora);
            }
        }
    }
}
