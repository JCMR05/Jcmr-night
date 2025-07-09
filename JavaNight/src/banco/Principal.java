/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package banco;


/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos", 300000.00);
        CuentaBancaria cuenta2 = new CuentaBancaria("Camilo", 300000.00);
        
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        
        cuenta1.transferencia(cuenta2, 15000);
        
        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        
    }
}