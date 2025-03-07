/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaiiparcial_enzo;

/**
 *
 * @author DELL
 */
public class TareaIIParcial_Enzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo de uso
        Doctor p1 = new Doctor("Daniel Urbina", 36, "Barrio Valle", "Odontologia", 30);
        Deportista p2 = new Deportista("Angeles Rosales", 20, "Orocuina", "Futbol", "Motagua");

        // Obtener información de las personas
        System.out.println(p1.obtenerInformacion());
        System.out.println(p2.obtenerInformacion());

        // Modificar y obtener información usando getters y setters
        p1.setNombre("Daniel Ponce");
        p2.setDeporte("Beisbol");

        System.out.println(p1.obtenerInformacion());
        System.out.println(p2.obtenerInformacion());
    }
    
}
