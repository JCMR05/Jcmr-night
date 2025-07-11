/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.ejercicio5;

/**
 *
 * @author German Mora
 */

abstract class Vehiculo {

    double velocidadMaxima;

    public Vehiculo(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public abstract void mover();
    public abstract void detener();
    public void mostrarEstado(){
        mover();
        System.out.println("Velocidad maxima: " + velocidadMaxima);
        detener();
        
    };
    
}

class Auto extends Vehiculo{

    public Auto(double velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void mover() {
        System.out.println("El auto esta conduciendo...");
    }

    @Override
    public void detener() {
        System.out.println("El auto se detuvo.");
    }
}

class Bicicleta extends Vehiculo{

    public Bicicleta(double velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta esta rodando...");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se detuvo.");
    }

}

class Avion extends Vehiculo{

    public Avion(double velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void mover() {
        System.out.println("El avion esta despegando...");
    }

    @Override
    public void detener() {
        System.out.println("El avion aterrizo.");
    }

}

class Tren extends Vehiculo{

    public Tren(double velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void mover() {
        System.out.println("El tren esta partiendo...");
    }

    @Override
    public void detener() {
        System.out.println("El tren se detuvo.");
    }
    
    @Override
    public void mostrarEstado(){
        
        mover();
        System.out.println("Velocidad maxima: " + velocidadMaxima);
        if (velocidadMaxima < 1000) 
        { detener();
        } else {
            System.out.println("Velocidad insegura!");
            activarFrenosDeEmergencia();
        }
        
    };
    
    private void activarFrenosDeEmergencia(){
        System.out.println("El tren freno de emergencia!");
    }

    
    
}

public class Trafico {
    
    public static void main(String[] args){
        Vehiculo[] vehiculos = {
            new Auto(125),
            new Bicicleta(90),
            new Avion(450),
            new Tren(1001)
        };
        
        for (Vehiculo v:vehiculos){
            v.mostrarEstado();
            System.out.println("----------------------");
        }
    }
    
}
