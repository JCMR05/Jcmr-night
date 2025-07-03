/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio4;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos", 150000.00);
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo Inicial: $ " + cuenta1.getSaldo());
        
        System.out.println("Depositando $ 30.000");
        cuenta1.depositar(30000);
        System.out.println("Saldo despues del deposito: $ " + cuenta1.getSaldo());
        
        System.out.println("Retirar $100.000");
        cuenta1.retirar(100000);
        System.out.println("Saldo despues de retirar: $ " + cuenta1.getSaldo());
        
        System.out.println("Retirar $200.000");
        cuenta1.retirar(200000);
        System.out.println("Saldo despues de retirar: $ " + cuenta1.getSaldo());
        
        CuentaBancaria cuenta2 = new CuentaBancaria("Mateo el perro ateo", 300000.00);
        System.out.println("Titular: " + cuenta2.getTitular());
        System.out.println("Saldo Inicial: " + cuenta2.getSaldo());
        
        
    }
}
