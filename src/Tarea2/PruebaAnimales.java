package Tarea2;
public class PruebaAnimales {
    public static void main(String[] args) {
        Perro perro=new Perro();
        Gato gato=new Gato();
        Cucaracho cucaracho=new Cucaracho();
        
        System.out.println("Perro:");
        System.out.println("come: "+perro.comer());
        System.out.println("habitar: "+perro.habitar());
        System.out.println("dormir: "+perro.dormir());
        System.out.println("\n");
        
        System.out.println("Gato:");
        System.out.println("come: "+gato.comer());
        System.out.println("habitar: "+gato.habitar());
        System.out.println("dormir: "+gato.dormir());
        System.out.println("\n");
        
        System.out.println("Cucaracho:");
        System.out.println("come: "+cucaracho.comer());
        System.out.println("habitar: "+cucaracho.habitar());
        System.out.println("dormir: "+cucaracho.dormir());
    }
}
