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
class Deportista extends Persona {
    private String deporte;
    private String equipo;

    public Deportista(String nombre, int edad, String direccion, String deporte, String equipo) {
        super(nombre, edad, direccion);
        this.deporte = deporte;
        this.equipo = equipo;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String obtenerInformacion() {
        return "Deportista " + getNombre() + ", Edad: " + getEdad() + ", Deporte: " + getDeporte() + ", Equipo: " + getEquipo();
    }
}
