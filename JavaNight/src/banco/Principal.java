/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<< HEAD
package banco;
=======
package poo.ejercicio3;
>>>>>>> b7e502d8a7b008f3f4f74be2ad7b5a19e34c4d65

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