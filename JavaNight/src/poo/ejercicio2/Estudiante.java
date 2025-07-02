/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio2;

/**
 *
 * @author SENA
 */
public class Estudiante {
    String nombre;
    String codigo;
    double promedio;
    
    public Estudiante(String n, String c, double p){
        this.nombre = n;
        this.codigo = c;
        this.promedio = p;
    }
    
    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Promedio: " + promedio);
    }
}
