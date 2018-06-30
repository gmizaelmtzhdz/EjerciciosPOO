package Tarea5;

import Tarea4.Fecha;

public class Gerente extends Empleado {
    private Fecha fecha_revision_reporte_gerente;
    public Gerente()
    {
        this.setPuesto("Gerente");
        fecha_revision_reporte_gerente=new Fecha(10,2,2018);
    }
    @Override
    public float calcularISR() {
        return (float) (this.getSalario()*0.20);
    }
    //Método adicional
    public String fecha_revision_reporte_gerente()
    {
        return "Fecha de revisión de reporte de Gerente: "+this.fecha_revision_reporte_gerente.getFecha();
    }
}
