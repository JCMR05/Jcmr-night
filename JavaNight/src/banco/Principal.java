/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio3;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos", 300000.00);
        
        System.out.println("Intentando sacar $300.000...");
        
        cuenta1.retirar(300000.00);
        
        System.out.println("No puede retirar mas de...");
        
        cuenta1.mostrarInformacion();
    }
}