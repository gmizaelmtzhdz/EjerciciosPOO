package Sesion2;
/**
 *
 * Clase compacto hereda de Vehiculo
 */
public class Compacto extends Vehiculo
{
    //variables de instancia exclusivas de los Compactos
    private int num_puertas;
    
    //constructor
    public Compacto(String num_serie, String matricula, int num_puertas)
    {
        super(num_serie, matricula);
        this.num_puertas=num_puertas;
    }

    @Override
    public String rendGas() {
        return "El rendimiento 16km/litro";
    }

    @Override
    public String costoMant() {
        return "Costo mantenimiento $1500 + iva";
    }
    
    //métodos exclusivos de la clase Compacto
    public int getNum_puertas() {
        return num_puertas;
    }
    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }
    
}