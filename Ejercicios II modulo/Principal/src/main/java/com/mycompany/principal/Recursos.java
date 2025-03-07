/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author saman
 */


class Recursos {

    public String Mensaje() {
        return "Programación Orientada a Objetos 2021";
    }
    public String Edad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }
    public int Multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

      public int NumeroX(int x) {
        //List<Integer> numeros = new ArrayList<>();
        //int numeros;
        for (int i = 1; i <= x; i++) {
            //numeros.add(i);
            System.out.print(i + ", ");
        
        }
        return 0;
        
}
}

