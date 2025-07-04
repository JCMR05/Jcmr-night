/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herencia.ejercicio1;

/**
 *
 * @author SENA
 */
public class Coordinador extends Empleado {
    
    private String departamentoAsignado;
    private double bono;

    public Coordinador(String departamentoAsignado, double bono, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamentoAsignado = departamentoAsignado;
        this.bono = bono;
    }

    public String getDepartamentoAsignado() {
        return departamentoAsignado;
    }

    public void setDepartamentoAsignado(String departamentoAsignado) {
        this.departamentoAsignado = departamentoAsignado;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
