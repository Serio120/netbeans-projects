/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosalgoritmia;

/**
 *
 * @author Imp_06 - Mañana
 */
public class LaBurbuja {
    
}
/*
La burbuja:
a = [3, -1, 7, 0, 4] una pasada
a = [-1, 3, 7, 0 ,4] una pasada
a = [-1, 3, 0, 7, 4] una pasada
Este algorito se llama la burbuja por el cambio y asignación de posiciones
--------PSEUDOCÓDIGO-------------
Algoritmo Burbuja
Entrada: arreglo A con n elementos
Salida: arreglo A ordenado de menor a mayor

Para i desde 0 hasta n-2 hacer
    Para j desde 0 hasta n-2-i hacer
        Si A[j] > A[j+1] entonces
            // Intercambiar A[j] y A[j+1]
            temp = A[j]
            A[j] = A[j+1]
            A[j+1] = temp
        FinSi
    FinPara
FinPara

FinAlgoritmo
*/