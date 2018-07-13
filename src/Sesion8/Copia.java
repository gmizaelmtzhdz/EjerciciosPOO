package Sesion8;
import java.io.*;
/**
 * Esta clase copia el contenido de un archivo a otro archivo
 * 
 * Sesion 8
 */
public class Copia {
 
    public static void main(String[] args) {
 
        while (true) {
 
            // valida el numero de argumentos
            if (args.length != 2) {
                System.out.println("Error: se requieren dos argumentos");
                System.out.println("Ejemplo: Copia archivo1 archivo2");
                break;
            }
 
            // obtener el archivo fuente
            File fuente = new File(args[0]);
 
            // validar que el archivo fuente exista o tenga permisos de lectura
            if (!fuente.exists() || !fuente.canRead()) {
                System.out.println("Error: el archivo fuente no existe o no tiene permisos");
                break;
            }
 
            // declarar el archivo destino
            File destino = new File("archivo2");
 
            // declarar variables de referencia para manejo de archivos
            FileInputStream fin = null;
            FileOutputStream fout = null;
 
            // validar que el archivo fuente sea un archivo de texto
            if (fuente.isFile()) {
                int leer;
                try {
                    // instanciar objetos para manejo de archivos
                    fin = new FileInputStream(fuente);
                    fout = new FileOutputStream(destino);
 
                    // realizar el copiado de archivos
                    while ((leer = fin.read()) != -1) {
                        fout.write(leer);
                    }
 
                } catch (IOException e1) {
                    System.out.println("Ocurrio una excepcion al intentar hacer la copia");
                    e1.printStackTrace();
                    break;
                } finally {
                    try {
                        fin.close();
                        fout.close();
                        break;
                    } catch (IOException e2) {
                        System.out.println("Ocurrio una excepcion al intentar cerrar los archivos");
                        e2.printStackTrace();
                        break;
                    }
                }
            }
            else {
                System.out.println("Error: el archivo fuente no es un archivo de texto");
                break;
            }
 
        }
         
        System.out.println("Archivo fuente [" + args[0] + "] copiado satisfactoriamente");
        System.out.println("Archivo destino [" + args[1] + "]");
 
    }
}