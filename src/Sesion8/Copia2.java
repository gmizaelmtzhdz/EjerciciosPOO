
package Sesion8;

import java.io.*;
 
/**
 * Esta clase copia el contenido de un archivo a otro archivo
 */
public class Copia2 {
 
    public static void main(String[] args) {
        try {
            // Definicion de flujos para procesar el archivo fuente
            FileReader archReader = new FileReader("archivo3");
            BufferedReader bufReader = new BufferedReader(archReader);
 
            // Definicion de flujos para procesar el archivo destino
            FileWriter archWriter = new FileWriter("archivo22");
            BufferedWriter bufWriter = new BufferedWriter(archWriter);
 
            String fila;
 
            // Realiza la copia 
            while ((fila = bufReader.readLine()) != null) {
                bufWriter.write(fila);
                bufWriter.newLine();
            }
 
            try {
                // Cerrar archivos
                bufReader.close();
                bufWriter.close();
            } catch (IOException e2) {
                System.out.println("Ocurrio una excepcion al intentar cerrar los archivos");
                e2.printStackTrace();
            }
 
        } catch (IOException e) {
            System.out.println("Ocurrio una excepcion al intentar copiar");
            e.printStackTrace();
        }
    }
}