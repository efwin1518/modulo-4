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
public class Ejercicio6 {
    
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double nota;
        System.out.print("Digite el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.println("Digite la nota");
        nota = entrada.nextDouble();
        
        if(nota>=70) {
            System.out.println(nombre + " ha aprobado");
        } else {
            System.out.println(nombre + "  ha reprobado");
        }
    }
}
