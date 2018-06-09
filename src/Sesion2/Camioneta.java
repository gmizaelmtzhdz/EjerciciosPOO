
package Sesion2;

/**
 *
 * Clase Camioneta hereda de Vehículo
 */
public class Camioneta extends Vehiculo
{
    //variable de instancia de la clase Camioneta
    private String capacidad;
    
    //constructor 
    public Camioneta(String num_serie, String matricula, String cap)
    {
        super(num_serie, matricula);
        this.capacidad=cap;
    }
    
    //implementación de los métodos abstractos
    @Override
    public String rendGas() {
        return "El rendimiento de gasolina de una camioneta es de 12km/litro";
    }
    @Override
    public String costoMant() {
        return "El costo de manteminiento de una camioneta es de 2200 + iva";
    }
}
