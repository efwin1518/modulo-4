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
class Doctor extends Persona {
    private String especialidad;
    private int aniosExperiencia;

    public Doctor(String nombre, int edad, String direccion, String especialidad, int aniosExperiencia) {
        super(nombre, edad, direccion);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String obtenerInformacion() {
        return "Doctor " + getNombre() + ", Edad: " + getEdad() + ", Especialidad: " + getEspecialidad() + ", Años de experiencia: " + getAniosExperiencia();
    }
}

