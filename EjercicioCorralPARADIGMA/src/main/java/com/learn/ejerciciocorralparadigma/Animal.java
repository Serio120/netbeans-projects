/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.learn.ejerciciocorralparadigma;

/**
 *
 * @author Imp_06 - Mañana
 */
/**
 * Interfaz que define el comportamiento básico de un animal en el corral.
 */
public interface Animal {
    /**
     * Simula lo que hace un animal durante una hora específica del día.
     * @param hora La hora del día, un valor entre 0 y 23.
     */
    public void viveUnaHora(int hora);
}
