/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
/**
 *
 * @author G. Mizael Mtz Hdz
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Perro p1=new Perro();
        Perro p2=new Perro("Boby", "Chihuahua");
        Perro p3=new Perro("Bombon", "Collie","Negro","mediano",6);
        Perro p4=new Perro("Jackie", 15);
        
        p1.setNombre("NombreA");
        p1.setColor("cafe");
        p1.setEdad(5);
        p1.setRaza("Rottweiler");
        p1.setTamano("Grande");
        
        System.out.println("Nombre del Perro = "+p1.getNombre());
        System.out.println("Nombre del Perro = "+p2.getNombre());
        System.out.println("Nombre del Perro = "+p3.getNombre());
        System.out.println("Nombre del Perro = "+p4.getNombre());
    }
}
