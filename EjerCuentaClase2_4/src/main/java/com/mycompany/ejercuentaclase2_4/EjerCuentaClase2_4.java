/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercuentaclase2_4;

/**
 *
 * @author maria
 */
public class EjerCuentaClase2_4 {
    // Atributos
    private String titular;
    private double cantidad;
    
    // Constructor 1: Solo titular (obligatorio), cantidad se inicializa en 0
    public EjerCuentaClase2_4(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }
    
    // Constructor 2: Titular y cantidad
    public EjerCuentaClase2_4(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    // Métodos get y set
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
        return "EjerCuentaClase2_4{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
    
    // Métodos especiales
    
    /**
     * Ingresa una cantidad a la cuenta
     * Si la cantidad es negativa, no se hace nada
     * @param cantidad La cantidad a ingresar
     */
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }
    
    /**
     * Retira una cantidad de la cuenta
     * Si el resultado es negativo, la cantidad de la cuenta pasa a ser 0
     * @param cantidad La cantidad a retirar
     */
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad -= cantidad;
            if (this.cantidad < 0) {
                this.cantidad = 0;
            }
        }
    }
    
    // Método main para las pruebas
    public static void main(String[] args) {
        // Prueba del constructor con solo titular
        EjerCuentaClase2_4 cuenta1 = new EjerCuentaClase2_4("Juan Perez");
        System.out.println("Cuenta 1: " + cuenta1);
        
        // Prueba del constructor con titular y cantidad
        EjerCuentaClase2_4 cuenta2 = new EjerCuentaClase2_4("Maria Garcia", 1500.50);
        System.out.println("Cuenta 2: " + cuenta2);
        
        // Pruebas de los métodos especiales
        System.out.println("\n--- Pruebas de metodos especiales ---");
        
        // Ingresar cantidad positiva
        cuenta1.ingresar(500.75);
        System.out.println("Despues de ingresar 500.75: " + cuenta1);
        
        // Intentar ingresar cantidad negativa (no debe hacer nada)
        cuenta1.ingresar(-100);
        System.out.println("Despues de intentar ingresar -100: " + cuenta1);
        
        // Retirar cantidad normal
        cuenta2.retirar(200);
        System.out.println("Despues de retirar 200: " + cuenta2);
        
        // Retirar cantidad que deja la cuenta en negativo (debe quedar en 0)
        cuenta2.retirar(2000);
        System.out.println("Despues de retirar 2000: " + cuenta2);
        
        // Intentar retirar cantidad negativa (no debe hacer nada)
        cuenta1.retirar(-50);
        System.out.println("Despues de intentar retirar -50: " + cuenta1);
    }
}