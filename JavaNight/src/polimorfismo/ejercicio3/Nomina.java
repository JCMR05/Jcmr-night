/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.ejercicio3;

/**
 *
 * @author SENA
 */

abstract class Empleado{
    String nombre;
    int ID;
    
    public Empleado(int ID, String nombre) {
        this.nombre = nombre;
        this.ID = ID;
    }
    
    
    
    abstract double calcularSalario();
    public void mostrarResumen(){
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        if (1600000 < calcularSalario()) 
        {   System.out.println("Salario calculado: " + calcularSalario());
        } else {
            System.out.println("No supera el salario minimo legal vigente");
        }
        
    }
}

class EmpleadoTiempoCompleto extends Empleado{
    double salarioMensual;

    public EmpleadoTiempoCompleto(int ID, String nombre, double salarioMensual) {
        super(ID, nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    double calcularSalario() {
        return salarioMensual;
    }
}

class EmpleadoMedioTiempo extends Empleado{
    double salarioPorHora;
    int horasTrabajadas;

    public EmpleadoMedioTiempo(int ID, String nombre, double salarioPorHora, int horasTrabajadas) {
        super(ID, nombre);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
    
}

class EmpleadoFreelance extends Empleado{
    double tarifaProyecto;

    public EmpleadoFreelance(int ID, String nombre, double tarifaProyecto) {
        super(ID, nombre);
        this.tarifaProyecto = tarifaProyecto;
    }

    @Override
    double calcularSalario() {
        return tarifaProyecto;
    }
    
}

class Practicante extends Empleado{
    double bMensual;
    double salarioP;

    public Practicante(int ID, String nombre, double bMensual, double salarioP) {
        super(ID, nombre);
        this.bMensual = bMensual;
        this.salarioP = salarioP;
    }

    @Override
    double calcularSalario() {
        double salarioTotal = bMensual + salarioP;
        return salarioTotal;
    }
    
}

public class Nomina {
    public static void main(String[] args){
        Empleado[] empleados = {
            new EmpleadoTiempoCompleto(1, "Lucía", 3000000),
            new EmpleadoMedioTiempo(5, "Carlos",25000,80),
            new EmpleadoFreelance(120, "Diana", 1800000),
            new Practicante(13, "Camilo", 180000, 360000)
        };
        
        for (Empleado e:empleados){
            System.out.println(e.nombre + ": $" + e.calcularSalario());
            e.mostrarResumen();
        }
    }
    
    
}
