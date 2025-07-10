/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo.ejercicio4;

/**
 *
 * @author SENA
 */
abstract class Mensaje{
    String destinatario;
    
    public abstract void enviar();

    public Mensaje(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public void resumir(){
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Estado: ");
        enviar();
    }
    
}

class Correo extends Mensaje{

    public Correo(String destinatario) {
        super(destinatario);
    }
    @Override
    public void enviar() {
        System.out.println("Enviando correo electronico...");
    }
    
}

class SMS extends Mensaje{

    public SMS(String destinatario) {
        super(destinatario);
    }
    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto SMS...");
    }
    
}

class NotificacionPush extends Mensaje{

    public NotificacionPush(String destinatario) {
        super(destinatario);
    }
    @Override
    public void enviar() {
        System.out.println("Enviando notificacion push...");
    }
    
}

class MensajeDeVoz extends Mensaje{

    double duracion;
    
    public MensajeDeVoz(String destinatario, double duracion) {
        super(destinatario);
        this.duracion = duracion;
    }
    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de voz...");
    }
    @Override
    public void resumir(){
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Estado: ");
        enviar();
        System.out.println("Duracion: " + duracion + " segundos");
    }
}

public class SistemaMensajeria {
    public static void main(String[] args){
        Mensaje[] mensajes={
        new Correo("Juan"),
        new SMS("Jhon"),
        new NotificacionPush("Carlos"),
        new MensajeDeVoz("Andres", 4)
        };
        
        for (Mensaje m:mensajes){
            m.enviar();
            m.resumir();
        }
    }
}
