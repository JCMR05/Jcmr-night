/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.ejercicio2;

/**
 *
 * @author SENA
 */

abstract class Forma{
    protected String color;
    public Forma(String color){
        this.color = color;
    }
    
    public abstract String getTipo();
    public void mostrarDatos(){
        
        System.out.println("Su tipo de figura es: " + getTipo());
        System.out.println("Su color es: " + color);
        
    }
    public abstract double calcularArea();
    
} 

class Circulo extends Forma {
    double radio;
    public Circulo(double radio, String color){
        this.radio = radio;
        super(color);
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    @Override
    public String getTipo(){
        return "Circulo";
    }
}

class Rectangulo extends Forma {
    double base, altura;
    public Rectangulo(double base, double altura, String color){
        this.base = base;
        this.altura = altura;
        super(color);
    }
    
    @Override
    public double calcularArea(){
        return base * altura;
    }
    @Override
    public String getTipo(){
        return "Rectangulo";
    }
}

class Triangulo extends Forma {
    double base, altura;
    public Triangulo(double base, double altura, String color){
        this.base = base;
        this.altura = altura;
        super(color);
    }
    
    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }
    
    @Override
    public String getTipo(){
        return "Triangulo";
    }
}

class Trapecio extends Forma {
    double baseMayor, baseMenor, altura;
    public Trapecio(double baseMayor, double baseMenor, double altura, String color){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        super(color);
    }
    
    @Override
    public double calcularArea(){
        return (baseMayor + baseMenor)* altura /2;
    }
    
    @Override
    public String getTipo(){
        return "Trapecio";
    }
}

public class PruebaFormas{
    public static void main(String[] args){
        Forma[] formas = {
            new Circulo(5, "verde"),
            new Triangulo(3,8, "rojo"),
            new Rectangulo(4,6, "amarillo"),
            new Trapecio(5,3,7, "azul")
        };
        
        for (Forma f:formas){
            System.out.println("Area: " + f.calcularArea());
            f.mostrarDatos();
        }
    }
}