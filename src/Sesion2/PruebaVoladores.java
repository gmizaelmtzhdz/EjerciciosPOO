package Sesion2;
/**
 *
 * Clase de prueba para objetos que implementan la interfaz Volador
 */
public class PruebaVoladores
{
    public static void main(String[] args) {
        Aves a1 = new Aves("Chico", "Negro");
        Aviones a2 = new Aviones("Mediano", "Potente");
        
        System.out.println("Información de las aves");
        System.out.println("Despegue de un ave: "+a1.despegar());
        System.out.println("Vuelo de un ave: "+a1.volar());
        System.out.println("Aterrizaje de un ave: "+a1.aterrizar());
        System.out.println("Dieta de un ave: "+a1.dieta());
        
        System.out.println("\n------------------------------------\n");
        
        System.out.println("Información de las aviones");
        System.out.println("Despegue de un avion: "+a2.despegar());
        System.out.println("Vuelo de un avion: "+a2.volar());
        System.out.println("Aterrizaje de un avion: "+a2.aterrizar());
    }
}
