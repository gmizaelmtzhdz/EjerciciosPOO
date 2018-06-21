package Tarea4;

import java.util.ArrayList;

public class PruebaClientes {
    public static void main(String[] args) {
        
        int numero_clientes=4;
        
        //Arreglo convencional
        System.out.println("*********************");
        System.out.println("ARRAY CONVENCIONAL");
        Cliente[] arreglo_convencional=new Cliente[numero_clientes];
        for(int i=0;i<arreglo_convencional.length;i++)
        {
            arreglo_convencional[i]=new Cliente("Cliente no. "+(i+1),i+1);
            arreglo_convencional[i].setSaldo(arreglo_convencional[i].getArticulos());
            System.out.println("Cliente [" + arreglo_convencional[i].getNombre() + "] con numero de cuenta [" + arreglo_convencional[i].getNumCuenta() + "]");
            System.out.println("Saldo antes de promociones y descuentos: "+arreglo_convencional[i].getSaldo());
            arreglo_convencional[i].aplicar_descuento_cliente();
            System.out.println("Descuento: "+arreglo_convencional[i].getDescuento());
            arreglo_convencional[i].aplicar_promocion_cliente();
            System.out.println("Saldo final: "+arreglo_convencional[i].getSaldo());
            System.out.println("\n\n");
        }
        
        //ArrayList
        System.out.println("*********************");
        System.out.println("ARRAYLIST");
        ArrayList<Cliente> arraylist=new ArrayList<Cliente>();
        Cliente cliente;
        for(int i=0;i<numero_clientes;i++)
        {
            cliente=new Cliente("Cliente arraylist no. "+(i+1),(i+1));
            arraylist.add(cliente);
            arraylist.get(i).setSaldo(arraylist.get(i).getArticulos());
            System.out.println("Cliente [" + arraylist.get(i).getNombre() + "] con numero de cuenta [" + arraylist.get(i).getNumCuenta() + "]");
            System.out.println("Saldo antes de promociones y descuentos: "+arraylist.get(i).getSaldo());
            arraylist.get(i).aplicar_descuento_cliente();
            System.out.println("Descuento: "+arraylist.get(i).getDescuento());
            arraylist.get(i).aplicar_promocion_cliente();
            System.out.println("Saldo final: "+arraylist.get(i).getSaldo());
            System.out.println("\n\n");
            
        }
        
    }
}
