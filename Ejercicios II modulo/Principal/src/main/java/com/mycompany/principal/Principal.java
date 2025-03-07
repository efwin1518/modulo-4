/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;



/**
 *
 * @author saman
 */

public class Principal {

    public static void main(String[] args) {
        
        Recursos recursos = new Recursos(); 

        System.out.println("Resultado del metodo numero uno: " + recursos.Mensaje());

        int edadEstudiante = 22; 
        System.out.println("Resultado del método numero dos: " + recursos.Edad(edadEstudiante));

        int num1 = 10;
        int num2 = 4;
        System.out.println("Resultado del método numero tres: " + recursos.Multiplicacion(num1, num2));
        
        int x = 15;
        System.out.println("Resultado del cuarto metodo:");
        System.out.println(recursos.NumeroX(x));
       
        
    }
}

