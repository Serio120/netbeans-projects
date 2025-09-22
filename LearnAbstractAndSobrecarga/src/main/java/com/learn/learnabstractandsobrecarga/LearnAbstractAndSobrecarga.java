/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.learn.learnabstractandsobrecarga;

/**
 * @ learn mns
 * @author davinia
 */
public class LearnAbstractAndSobrecarga {

    public static void main(String[] args) {
        //Persona p = new Persona("Davinia", "de la Rosa", "11111111A"); ERROR si es abstract
        //Profesor p2 = new Persona("Rita", "Pérez", "11111111B"); ERROR porque no puedo construir como Persona un Profesor
        Persona p2 = new Profesor("Rita", "Pérez", "11111111B", "a@a.com", 1000);
        
        Persona[] personas = new Persona[4];
        personas[0] = new Profesor("Davinia", "de la Rosa", "11111111A");
        personas[1] = new Profesor("Rita", "Pérez", "11111111B", "a@a.com", 1000);
        personas[2] = new Alumno ("Ruperto", "Ramirez", "11111111C", "ALU1234");
        personas[3] = new PersonalAdmin ("Telesforo", "Hernandez", "11111111D", "Secretaría");
        personas[1].resgitrarPrimerAcceso();
        personas[2].resgitrarPrimerAcceso();
    }   
}
