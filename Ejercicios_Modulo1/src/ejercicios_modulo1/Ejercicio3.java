/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_modulo1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio3 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 6, t=1, k=-10;
        boolean i;
        
        if(m>t) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        if((t/k)==-5) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        if((m+t==7)||(m-t==5)) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
    }
}
