/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_modulo1;

/**
 *
 * @author DELL
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        String[] nombre={"Alejandra", "Cesar", "David", "Jose", "Laura"};
        String[] apellido={"Lopez", "Lopez", "Flores", "Alfaro", "Castillo"};
        String[] carrera={"Industrial", "Computacion", "Electronica", "Industrial", "Computacion"};
        String[] lugarTrabajo={"Mendez", "El Titan", "Tecnos", "Televicentro", "Cable Vision"};
        
        System.out.println("Nombre      Apellido        Carrera          Lugar De Trabajo");
        for(int i=0;i<5;i++){
            System.out.println(nombre[i] + "         " + apellido[i] + "        " + carrera[i] + "        " + lugarTrabajo[i]);
        }
    }
}
