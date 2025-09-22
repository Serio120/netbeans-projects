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
 * Representa a una gallina en el corral.
 */
public class Gallina extends AnimalAbstracto {

    public Gallina(String nombre) {
        super(nombre);
    }

    @Override
    public void viveUnaHora(int hora) {
        // Horas de actividad: entre las 6h y las 20h.
        if (hora >= 6 && hora <= 20) {
            if (hora % 6 == 1) { // Pone un huevo en las horas 7, 13, 19.
                System.out.println("La gallina " + getNombre() + " esta poniendo un huevo.");
            } else if (hora % 3 == 0) { // Come en las horas 6, 9, 12, 15, 18.
                System.out.println("La gallina " + getNombre() + " esta comiendo.");
            } else {
                System.out.println("La gallina " + getNombre() + " esta picoteando.");
            }
        } else { // El resto del tiempo (21h a 5h) duerme.
            System.out.println("La gallina " + getNombre() + " esta durmiendo.");
        }
    }
}
