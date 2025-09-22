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
 * Representa a un gato en el corral, con hábitos nocturnos.
 */
public class Gato extends AnimalAbstracto {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void viveUnaHora(int hora) {
        // El gato duerme principalmente de día (8h a 20h).
        if (hora >= 8 && hora <= 20) {
            System.out.println("El gato " + getNombre() + " esta durmiendo profundamente.");
        } else { // Está despierto por la noche (21h a 7h).
            if (hora % 8 == 5) { // Come al despertarse y antes de dormir (21h, 5h).
                 System.out.println("El gato " + getNombre() + " esta comiendo pescado.");
            } else if (hora <= 4 || hora >= 23) { // Caza en la madrugada (23h a 4h).
                System.out.println("El gato " + getNombre() + " esta cazando en la oscuridad.");
            } else { // Juega el resto del tiempo que está despierto.
                System.out.println("El gato " + getNombre() + " esta jugando con un ovillo.");
            }
        }
    }
}
