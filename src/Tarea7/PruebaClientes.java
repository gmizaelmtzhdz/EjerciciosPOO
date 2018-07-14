package Tarea7;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class PruebaClientes {
    public static void main(String[] args)
    {
        ArrayList<String> cliente_premium=new ArrayList<String>();
        ArrayList<String> cliente_normal=new ArrayList<String>();
        
        ArrayList<String> contenido=leer_archivo("tarea7_clientes.txt");
        if(contenido.size()>0)
        {
            int articulos=0;
            double precio=0.0;
            double descuento=0;
            int puntos=0;
            double total=0.0;
            
            for(int i=0;i<contenido.size();i++)
            {
                /*
                datos[0]="1"
                datos[1]="Jose Perez"
                datos[2]="Monterrey NL"
                datos[3]="premium"
                datos[4]="5"
                datos[5]="20"
                datos[6]="10"
                datos[7]="100"
                */
                String[] datos = contenido.get(i).split(",");
                
                articulos=Integer.parseInt(datos[4]);
                precio=Integer.parseInt(datos[5]);
                descuento=Integer.parseInt(datos[6]);
                puntos=Integer.parseInt(datos[7]);
                
                //validación por si el descuento es cero
                if(descuento!=0)
                {
                    descuento = descuento/100;
                }
                total = articulos * precio;
                total = total - (total*descuento);
                
                //calcular los puntos
                //por cada 2 artículos si es premium se le asigna 10 puntos
                //por cada 2 artículos si es normal se le asigna 5 puntos
                int segmento=articulos/2;
                if(datos[3].equals("premium"))
                {
                    puntos=puntos + segmento * 10;
                }
                else
                {
                    puntos=puntos + segmento * 5;
                }
                //Mostrar la información
                System.out.println("Número de cliente: "+datos[0]);
                System.out.println("Nombre: "+datos[1]);
                System.out.println("Domicilio: "+datos[2]);
                System.out.println("Tipo de Cliente: "+datos[3]);
                System.out.println("Artículos: "+articulos);
                System.out.println("Precio: $ "+precio);
                System.out.println("Descuento: "+datos[6]);
                System.out.println("Total: $ "+total);
                System.out.println("Puntos: "+puntos);
                System.out.println("\n\n\n");
                
                if(datos[3].equals("premium"))
                {
                    cliente_premium.add(datos[0]+","+datos[1]+","+datos[2]+","+datos[3]+","+articulos+","+precio+","+datos[6]+","+puntos+","+total+"\n");
                    escribir_archivo(cliente_premium,"tarea7_cliente_premium.txt");
                }
                else
                {
                    cliente_normal.add(datos[0]+","+datos[1]+","+datos[2]+","+datos[3]+","+articulos+","+precio+","+datos[6]+","+puntos+","+total+"\n");
                    escribir_archivo(cliente_normal,"tarea7_cliente_normal.txt");
                }
            }
        }
        else
        {
            //no hay clientes que leer: el archivo está vacio o no lo pudo abrir
            System.out.println("No hay clientes que leer :(");
        }
    }
    private static void escribir_archivo(ArrayList <String>contenido, String nombre_archivo)
    {
        File archivo = new File(nombre_archivo);
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(archivo));
            for(String fila: contenido)
            {
                bw.write(fila);
            }
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error al crear el archivo");
            Logger.getLogger(PruebaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static ArrayList leer_archivo(String ruta_archivo)
    {
        
        ArrayList<String> contenido=new ArrayList<String>();
        
        try {
            FileReader archReader = new FileReader(ruta_archivo);
            BufferedReader bufReader = new BufferedReader(archReader);
            String fila = null;
            while((fila = bufReader.readLine()) != null)
            {
                /*
                contenido[0]=1,Jose Perez, Monterrey NL, premium,5,20,10,100;
                contenido[1]=2,Danna Hernandez, Apodaca NL, normal,2,50,0,10
                ...
                contenido[4]=5,Fernanda Fernandez, Cienega de Flores NL, normal,30,55,0,20
                */
                contenido.add(fila);
            }
            bufReader.close();
        } catch (IOException e) {
            System.out.println("Ocurrio una excepcion IO, al tratar de leer el archivo: "+ruta_archivo);
            e.printStackTrace();
        }
        return contenido;
    }
}
