/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package banco;
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
    
    public void depositar(double monto) {
        if(monto > 0) saldo += monto;
    }
    
    public void transferencia(CuentaBancaria recibidor, double cantidad){
        this.retirar(cantidad);
        recibidor.depositar(cantidad);
    }
}
