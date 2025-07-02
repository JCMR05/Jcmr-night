

package poo.ejercicio1;



public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan";
        estudiante1.edad = 19;
        estudiante1.profesion = "analisis y desarrollo de software";
        estudiante1.saludo();
        
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Marta";
        estudiante2.edad = 24;
        estudiante2.profesion = "policia";
        estudiante2.saludo();
    }
}
