package Sesion4;

import java.util.ArrayList;
public class ArrayListEjemplo {
    public static void main(String[] args) {
        //Declaración de un arreglo dinamico de Strings
        ArrayList<String> lista=new ArrayList<String>();
        
        //Agregar elementos a lista
        lista.add("hola");
        lista.add(" mundo!");
        
        String s1=" Hoy es martes";
        lista.add(s1);
        ArrayList<String> lista2=new ArrayList<String>();
        
        lista2.add("hello");
        lista2.add(" world");
        
        lista.addAll(lista2);
        
        
        System.out.println("La lista está vacia? "+lista.isEmpty());
        System.out.println("El tamaño de la lista es = "+lista.size());
        
    }
}
