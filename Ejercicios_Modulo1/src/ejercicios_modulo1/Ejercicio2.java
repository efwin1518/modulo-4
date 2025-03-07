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
public class Ejercicio2 {
    
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, suma, resta, multiplicacion, division,mod;

        System.out.println("Ingrese el primer número:");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo número:");
        num2 = entrada.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        mod = num1 % num2;

        System.out.println("La Suma es: " + suma);
        System.out.println("La Resta es: " + resta);
        System.out.println("La Multiplicación es: " + multiplicacion);
        System.out.println("La División es: " + division);
        System.out.println("el modulo es: " + mod);
    }
}
