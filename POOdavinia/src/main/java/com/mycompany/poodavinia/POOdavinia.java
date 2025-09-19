/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poodavinia;

/**
 *
 * @author Imp_06 - Mañana
 */

public class POOdavinia {

    public static void main(String[] args) {
        /*
        v1 y v2 tienen estos datos
        color = "Blanco"; 
        nRuedas = 4;
        matricula="SIN_MATRICULAR";
        
        int n1 = 5;
        int n2 = 4;
        n2 = n1;
        v8 = v1; -> No se puede hacer porque guarda la dir
        de memoria
        */
        Vehiculo v1 = new Vehiculo();//AF34
        Vehiculo v2 = new Vehiculo();//16B8
        //De copia
        Vehiculo v8 = new Vehiculo(v1);//AA22
        /*
        v3: 
        color = "Rosa"
        nRuedas = 4;
        matricula="SIN_MATRICULAR";
        */
        Vehiculo v3 = new Vehiculo("Rosa");//AAAA
        /*
        v4: 
        color = "Naranja"
        nRuedas = 4;
        matricula="SIN_MATRICULAR";
        */
        Vehiculo v4 = new Vehiculo("Naranja");//ABA1
        /*
        v5: 
        color = "Negro"
        nRuedas = 4;
        matricula="ABC1234";
        */
        Vehiculo v5 = new Vehiculo("Negro", "ABC1234");//1111
        /*
        v6: 
        color = "Blanco"
        nRuedas = 2;
        matricula="ABC1235";
        */
        Vehiculo v6 = new Vehiculo(2, "ABC1235");//1112
        /*
        v7: 
        color = "Verde"
        nRuedas = 3;
        matricula="ABC1236";
        */
        Vehiculo v7 = new Vehiculo("Verde", 3, "ABC1236");//1B12
        //System.out.println(v7.getColor());
        //v7.setColor("Rojo");
        //System.out.println(v7.getColor());
        System.out.println(v7);
        v3.mostrarColor();
        
    }
}