
package Tarea5;
public class Operaciones extends Empleado{
    public Operaciones()
    {
        this.setPuesto("Operaciones");
    }
    @Override
    public float calcularISR() {
        return (float) (this.getSalario()*0.15);
    }
    
    
    //Método adicional
}
