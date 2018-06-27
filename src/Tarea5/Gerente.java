package Tarea5;
public class Gerente extends Empleado {
    public Gerente()
    {
        this.setPuesto("Gerente");
    }
    @Override
    public float calcularISR() {
        return (float) (this.getSalario()*0.20);
    }
    //Método adicional
}
