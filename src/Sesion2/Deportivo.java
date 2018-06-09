package Sesion2;

/**
 *
 * Clase Deportivo hereda de vehiculo
 */
public class Deportivo extends Vehiculo
{
    //variables de instancia del Deportivo
    private int rin;
    public Deportivo(String num_serie, String matricula, int rin)
    {
        super(num_serie, matricula);
        this.rin=rin;
    }
    @Override
    public String rendGas() {
        return "El rendimiento de gasolina de un deportivo es 10km/litro";
    }

    @Override
    public String costoMant() {
        return "El costo de mantenimiento de un deportivo es de $3000 + iva";
    }
    //métodos exclusivos de los autos deportivos

    /**
     * @return the rin
     */
    public int getRin() {
        return rin;
    }

    /**
     * @param rin the rin to set
     */
    public void setRin(int rin) {
        this.rin = rin;
    }
    
}
