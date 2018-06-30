package Tarea5;
import Tarea4.Fecha;
public class Director extends Empleado {
    private Fecha fecha_revision_reporte_directivo;
    
    public Director( )
    {
        this.setPuesto("Director");
        fecha_revision_reporte_directivo=new Fecha(11,12,2018);
    }
    @Override
    public float calcularISR() {
     return (float) (this.getSalario()*0.22);
    }
    
    //Método adicional
    public String fecha_revision_reporte_directivo()
    {
        return "Fecha de revisión de reporte del directivo: "+this.fecha_revision_reporte_directivo.getFecha();
    }
}
