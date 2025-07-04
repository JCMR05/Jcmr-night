/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herencia.ejercicio1;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args) {
        Coordinador coordinador1  = new Coordinador("Tic", 1000000, "Carlos", 2500000);
        // Todo esto es la instancia y coordinador1 el objeto
        String nombre = coordinador1.getNombre();
        System.out.println("Nombre del coordinador: " + nombre);
        coordinador1.setNombre("Arturo");
        String Nuevonombre = coordinador1.getNombre();
        System.out.println("Nuevo nombre del coordinador: " + Nuevonombre);
        
        System.out.println("---------------------------------------------------");
        
        Profesor profesor1 = new Profesor("Matematicas", "Luis Garcia", 3000000);
        System.out.println("Profesor: " + profesor1.getNombre());
        System.out.println("Materia: " + profesor1.getMateriasAsignadas());
        System.out.println("Sueldo: $" + profesor1.getSueldo());
        
        System.out.println("---------------------------------------------------");
        
        Coordinador coordinador2 = new Coordinador("Departamento de ciencias", 4000000, "Ana Torres",800000);
        System.out.println("Coordinador: " + coordinador2.getNombre());
        System.out.println("Departamento: " + coordinador2.getDepartamentoAsignado());
        System.out.println("Sueldo Base: $" + coordinador2.getSueldo());
        System.out.println("Bono: $" + coordinador2.getBono());
        
        System.out.println("---------------------------------------------------");
        
        Estudiante estudiante1 = new Estudiante("Carlos Barrientos", "Full Stack", 4.2);
        System.out.println("Estudiante: " + estudiante1.getNombre());
        System.out.println("Carrera: " + estudiante1.getCarrera());
        System.out.println("Promedio: " + estudiante1.getPromedio());
        
        
    }
}
