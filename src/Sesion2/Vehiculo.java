package Sesion2;

/**
 *
 * Clase vehiculo es abstracta
 */
public abstract class Vehiculo
{
    //variables de instancia
    private String num_serie;
    private String matricula;
    
    //constructor
    public Vehiculo(String num_serie, String matricula)
    {
        this.matricula=matricula;
        this.num_serie=num_serie;
    }
    //metodos abstractos 
    public abstract String rendGas();
    public abstract String costoMant();

    /**
     * @return the num_serie
     */
    public String getNum_serie() {
        return num_serie;
    }

    /**
     * @param num_serie the num_serie to set
     */
    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
