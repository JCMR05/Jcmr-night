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
public class CuentaBancaria {
    String titular;
    double saldo;
    
    public CuentaBancaria(String t, double s){
        this.titular = t;
        this.saldo = s;
    }
    
    public void retirar(double monto){
        if(monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro Exitoso. Saldo restante: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void mostrarInformacion(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
