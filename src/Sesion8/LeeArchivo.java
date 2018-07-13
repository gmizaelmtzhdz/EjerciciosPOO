package Sesion8;
import java.io.*;
 
/**
 * Clase LeeArchivo lee el contenido de un archivo y lo despliega en consola
 * 
 * Sesion 8
 */
public class LeeArchivo {
    public static void main(String[] args) {
        try {
            // declaracion de flujos para leer el archivo
            //File archivo = new File("archivo1");
            //File archivo = new File(args[0]);
            //FileReader archReader = new FileReader(archivo);
            //FileReader archReader = new FileReader("/home/mizael/Documentos/MAESTRIA TETRA III/PROGRAMACION ORIENTADA A OBJETOS/Ejercicio1/archivo.txt");
            FileReader archReader = new FileReader("archivo.txt");
            BufferedReader bufReader = new BufferedReader(archReader);
             
            String fila = null;
             
            // desplegar mientras el archivo contenga informacion 
            while((fila = bufReader.readLine()) != null)
                System.out.println("fila = " + fila);
                 
            bufReader.close();
             
        } catch (IOException e) {
            System.out.println("Ocurrio una excepcion IO");
            e.printStackTrace();
        }
    }
}
