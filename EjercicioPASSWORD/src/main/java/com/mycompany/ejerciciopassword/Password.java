/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopassword;
import java.util.Random;
/**
 *
 * @author Imp_06 - Mañana
 */

final class Password implements Comparable<Password> {
    // Atributos
    private int longitud;
    private String contraseña;

    // Constructor por defecto: longitud 8 y genera contraseña aleatoria
    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    // Constructor sobrecargado: recibe longitud y genera contraseña aleatoria
    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    // Constructor de copia: copia los atributos de otro objeto Password
    public Password(Password otro) {
        this.longitud = otro.longitud;
        this.contraseña = otro.contraseña;
    }

    // Método para generar contraseña aleatoria según la longitud
    public void generarPassword() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();

        // Caracteres posibles: mayúsculas, minúsculas y números
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";

        String todos = mayusculas + minusculas + numeros;

        for (int i = 0; i < longitud; i++) {
            int indice = rnd.nextInt(todos.length());
            sb.append(todos.charAt(indice));
        }

        contraseña = sb.toString();
    }

    // Método que devuelve true si la contraseña es fuerte según las condiciones
    public boolean esFuerte() {
        int mayus = 0;
        int minus = 0;
        int nums = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayus++;
            } else if (Character.isLowerCase(c)) {
                minus++;
            } else if (Character.isDigit(c)) {
                nums++;
            }
        }

        // Condiciones: al menos 2 mayúsculas, 1 minúscula y 5 números
        return (mayus >= 2 && minus >= 1 && nums >= 5);
    }

    // Getters
    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    // Setter para longitud, y genera nueva contraseña con la nueva longitud
    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    // Implementamos Comparable para ordenar alfabéticamente por contraseña
    @Override
    public int compareTo(Password o) {
        return this.contraseña.compareTo(o.contraseña);
    }

    // Para mostrar la contraseña fácilmente
    @Override
    public String toString() {
        return contraseña;
    }
}

