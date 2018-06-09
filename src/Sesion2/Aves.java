
package Sesion2;

/**
 *
 * Clase Aves que implementa la interfaz Volador
 */
public class Aves implements Volador
{
    private String tamanio;
    private String color;
    //constructor
    public Aves(String tam, String col)
    {
        tamanio=tam;
        color=col;
    }
    @Override
    public String despegar()
    {
        return "Las aves al despegar toman impulso y extienden sus alas";
    }

    @Override
    public String volar() {
       return "Al volar mueven sus alas";
    }

    @Override
    public String aterrizar() {
        return "Junta sus alas, disminuye su altitud";
    }
    //Métodos exclusivos de la clase Aves
    public String dieta()
    {
        return "La dieta de las aves es dependiendo de su tipo";
    }
}
