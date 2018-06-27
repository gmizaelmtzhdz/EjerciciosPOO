package Tarea5;
public class Analista extends Empleado{
    public Analista()
    {
        this.setPuesto("Analista");
    }
    @Override
    public float calcularISR() {
        return (float) (this.getSalario()*0.18);
    }
    //Método adicional
}
