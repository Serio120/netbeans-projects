/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopoo;

/**
 *
 * @author Imp_06 - Mañana
 */

public class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor con solo titular (cantidad opcional, por defecto 0)
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    // Método ingresar: solo suma si la cantidad es positiva
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Método retirar: si la resta es negativa, cantidad pasa a 0
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad -= cantidad;
            if (this.cantidad < 0) {
                this.cantidad = 0;
            }
        }
    }
}