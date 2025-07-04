/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herencia.ejercicio1;

/**
 *
 * @author SENA
 */
public class Profesor extends Empleado {

    private String materiasAsignadas;

    public Profesor(String materiasAsignadas, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.materiasAsignadas = materiasAsignadas;
    }

    public String getMateriasAsignadas() {
        return materiasAsignadas;
    }

    public void setMateriasAsignadas(String materiasAsignadas) {
        this.materiasAsignadas = materiasAsignadas;
    }

}
