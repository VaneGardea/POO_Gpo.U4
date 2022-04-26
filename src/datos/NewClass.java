package datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class NewClass {
    String nombre;
    String carrera;
    int semestre;

    public NewClass(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return "\nEl nombre es: " + nombre;
    }

    public String getCarrera() {
        return " \nLa carrera es: " + carrera;
    }

    public String getSemestre() {
        return "\nEl semestre es: " + semestre;
        
    
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}
