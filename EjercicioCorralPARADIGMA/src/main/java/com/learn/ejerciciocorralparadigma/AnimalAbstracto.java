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
 * Clase abstracta que proporciona una implementación base para cualquier animal,
 * incluyendo la gestión del nombre.
 */
public abstract class AnimalAbstracto implements Animal {

    private String nombre;

    /**
     * Constructor para crear un animal con un nombre específico.
     * @param nombre El nombre del animal.
     */
    public AnimalAbstracto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Se declara el método como abstracto, forzando a las clases hijas
    // a proporcionar una implementación concreta.
    @Override
    public abstract void viveUnaHora(int hora);
}