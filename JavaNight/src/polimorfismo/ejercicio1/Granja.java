/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.ejercicio1;

/**
 *
 * @author SENA
 */

class Animal {
    
    double Peso;
    
    public Animal(double Peso){
    this.Peso = Peso;
    }
    
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    
    public void mostrarInfo(){
    System.out.println("Su peso es: " + Peso + " kg");
    }
    
}

class Vaca extends Animal{

    public Vaca(double Peso) {
        super(Peso);
    }
    @Override
    public void hacerSonido(){
        System.out.println("La Vaca dice: Muuu");
    }
}

class Gallo extends Animal {

    public Gallo(double Peso) {
        super(Peso);
    }
    @Override
    public void hacerSonido(){
        System.out.println("El Gallo dice: Quiquiriqui");
    }
}

class Cerdo extends Animal {

    public Cerdo(double Peso) {
        super(Peso);
    }
    @Override
    public void hacerSonido(){
        System.out.println("El Cerdo dice: Oink");
    }
}

class Pato extends Animal {

    public Pato(double Peso) {
        super(Peso);
    }
    @Override
    public void hacerSonido(){
        System.out.println("El Pato dice: Cuack");
        this.nadar();
    }
    private void nadar(){
        System.out.println("El Pato nada");
    }
}

public class Granja {
    
    public static void main(String[] args){
    
        Animal[] animales = {new Vaca(104.5), new Gallo(14.5), new Pato(16.2), new Cerdo(78.9)};
        
        for (Animal a: animales){
        a.hacerSonido();
        a.mostrarInfo();
        }
        
    }
    
}
