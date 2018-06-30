package Tarea5;

import Tarea4.Fecha;

public class Analista extends Empleado{
    private Fecha fecha_revision_reporte_analista; 
    public Analista()
    {
        this.setPuesto("Analista");
        fecha_revision_reporte_analista=new Fecha(10,7,2018);
    }
    @Override
    public float calcularISR() {
        return (float) (this.getSalario()*0.18);
    }
    //Método adicional
    public String fecha_revision_reporte_analista()
    {
        return "Fecha de revisión de reporte del analista: "+this.fecha_revision_reporte_analista.getFecha();
    }
}
