/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author invitado
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NewClass hola = new NewClass ("Rocío Vanesa Gardea Hernández", "Ing. Sistemas computacionales", 2);
       //encapsulamiento
       String NumCon = hola.getNombre() + "" + hola.getCarrera() + "" + hola.getSemestre();
        System.out.println("\nDatos generales alumno(a): " + NumCon);
        System.out.println("Hola");
    }
    
}
