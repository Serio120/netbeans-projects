/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebalaburbuja;

/**
 *
 * @author Imp_06 - Mañana
 */
public class ResolucionDavinia {
    
    public static void ejercico6(){
        //String[] a = {"casa", "arbol", "lunes", "martes", "miercoles", "jueves", "viernes"};
        int[] a = {7,6,5,4,3,2,1};
        int aux;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){    
                if(a[j]>a[j+1]){
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
                System.out.print(a[i]+"\n\n\n");
            }else{
                System.out.print(a[i]+"-");
            }
            
        }

        /*String c1 = "casa";//AF123
        String c2 = "casa";//AF124
        if(c1.equals(c2)){
            
        }*/
        
        /*String string1 = "Esto es un String";
	String string2 = "Esto es un String";
	String string3 = "Esto es un String diferente";
	System.out.println(string1.compareTo(string2));
	System.out.println(string1.compareTo(string3));*/
        
        
    }
}
