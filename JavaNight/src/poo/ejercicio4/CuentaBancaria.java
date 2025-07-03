/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.ejercicio4;

/**
 *
 * @author SENA
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;
    
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setTitular(String t){
        this.titular = t;
    }
    
    public void setSaldo(String s) {
        this.titular = s;
    }
    
    public void depositar(double monto) {
        if(monto > 0) saldo += monto;
    }
    
    public void retirar(double monto) {
        if(monto <= saldo) saldo -= monto;
    }
    
    public void transferencia(double monto1, double monto2) {
        if(monto1 <= 0) saldo -= monto1;
        
        
        
        if(monto2 > 0) saldo += monto2;
    }
}
