package Sesion2;
/**
 *
 * La clase Aviones implementa la interfaz Volador
 */
public class Aviones implements Volador
{
    //variables de instancia
    private String tamano;
    private String motor;
    //Constructor
    public Aviones(String tam, String motor)
    {
        this.tamano=tam;
        this.motor=motor;
    }
    //implementación de los 3 métodos abstractos
    @Override
    public String despegar() {
        return "Llevar el avión el inicio de la pista, acelera, levanta...";
    }

    @Override
    public String volar() {
        return "Checar el panel de control";
    }

    @Override
    public String aterrizar() {
        return "Disminuye su altitud, abre tren de aterrizaje";
    }    
    //métodos exlusivos de la clase Aviones
    public String mantenimiento()
    {
        return "Mantenimiento preventivo cada 3 meses";
    }
    public String rendimiento()
    {
        return "Consumo de combustible respecto a la velocidad ";
    }
}


