/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.learn.ejercicioherencia2;

/**
 *
 * @author Imp_06 - Mañana
 */

public class Electrodomestico {
    
    
    // Constantes estáticas
    protected static final double PRECIO_BASE_DEF = 100.0;
    protected static final String COLOR_DEF = "blanco";
    protected static final char CONSUMO_ENERGETICO_DEF = 'F';
    protected static final double PESO_DEF = 5.0;
    protected static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

    // Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Constructor por defecto
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_DEF;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        this.peso = PESO_DEF;
    }

    // Constructor con precio y peso, resto por defecto
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
    }

    // Constructor con todos los atributos
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // Constructor de copia
    public Electrodomestico(Electrodomestico otro) {
        this.precioBase = otro.precioBase;
        this.color = otro.color;
        this.consumoEnergetico = otro.consumoEnergetico;
        this.peso = otro.peso;
    }

    // Métodos get
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    // Método para comprobar consumo energético (no visible, private)
    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return CONSUMO_ENERGETICO_DEF;
        }
    }

    // Método para comprobar color (no visible, private)
    private String comprobarColor(String color) {
        if (color == null) {
            return COLOR_DEF;
        }
        String colorLower = color.toLowerCase();
        for (String c : COLORES_DISPONIBLES) {
            if (c.equals(colorLower)) {
                return c;
            }
        }
        return COLOR_DEF;
    }

    // Método precioFinal
    public double precioFinal() {
        double precioFinal = this.precioBase;

        // Aumento según consumo energético
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }

        // Aumento según peso
        if (this.peso >= 0 && this.peso < 20) {
            precioFinal += 10;
        } else if (this.peso >= 20 && this.peso < 50) {
            precioFinal += 50;
        } else if (this.peso >= 50 && this.peso < 80) {
            precioFinal += 80;
        } else if (this.peso >= 80) {
            precioFinal += 100;
        }

        return precioFinal;
    }
}