package Tarea5;
import Tarea4.Fecha;

public class Operaciones extends Empleado{
    private Fecha fecha_revision_reporte_operaciones;
    public Operaciones()
    {
        this.setPuesto("Operaciones");
        fecha_revision_reporte_operaciones=new Fecha(11,11,2011);
    }
    @Override
    public float calcularISR() {
        return (float) (this.getSalario()*0.15);
    }
    
    
    //Método adicional
    public String fecha_revision_reporte_operaciones()
    {
        return "Fecha de revisión de reporte de Operaciones: "+this.fecha_revision_reporte_operaciones.getFecha();
    }
}
