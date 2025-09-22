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
 * Representa a un perro en el corral.
 */
public class Perro extends AnimalAbstracto {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void viveUnaHora(int hora) {
        // Horas de actividad: entre las 8h y las 22h.
        if (hora >= 8 && hora <= 22) {
            if (hora % 9 == 0) { // Come en las horas 9 y 18.
                System.out.println("El perro " + getNombre() + " esta comiendo.");
            } else if (hora % 2 == 0) { // Pasea en las horas pares que no come.
                System.out.println("El perro " + getNombre() + " esta paseando.");
            } else { // Descansa en las horas impares que no come.
                System.out.println("El perro " + getNombre() + " esta descansando.");
            }
        } else { // El resto del tiempo duerme.
            System.out.println("El perro " + getNombre() + " esta durmiendo.");
        }
    }
}