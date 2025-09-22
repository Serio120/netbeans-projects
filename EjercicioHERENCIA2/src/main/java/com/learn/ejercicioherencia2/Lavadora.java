/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.ejercicioherencia2;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Lavadora extends Electrodomestico {
    // Constante para carga por defecto
    private static final double CARGA_DEF = 5.0;

    // Atributo carga
    private double carga;

    // Constructor por defecto
    public Lavadora() {
        super();
        this.carga = CARGA_DEF;
    }

    // Constructor con precio y peso, resto por defecto
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEF;
    }

    // Constructor con carga y resto de atributos heredados
    public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Constructor de copia
    public Lavadora(Lavadora otraLavadora) {
        super(otraLavadora);
        this.carga = otraLavadora.carga;
    }

    // Método get de carga
    public double getCarga() {
        return carga;
    }

    // Método precioFinal
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (this.carga > 30) {
            precio += 50;
        }
        return precio;
    }
}
