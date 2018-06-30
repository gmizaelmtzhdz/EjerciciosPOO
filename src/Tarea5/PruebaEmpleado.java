package Tarea5;
public class PruebaEmpleado
{
    public static void main(String[] args) {
        
        Empleado [] empleado=new Empleado[4];
        empleado[0]=new Analista();
        empleado[0].setNombre("Jose Pérez");
        empleado[0].setNumEmp(001);
        empleado[0].setPuesto("Analista");
        empleado[0].setSalario(1000);
        
        
        empleado[1]=new Director();
        empleado[1].setNombre("Luis Hernandez");
        empleado[1].setNumEmp(002);
        empleado[1].setPuesto("Director");
        empleado[1].setSalario(2000);
        
        
        empleado[2]=new Gerente();
        empleado[2].setNombre("Jorge Martinez");
        empleado[2].setNumEmp(003);
        empleado[2].setPuesto("Gerente");
        empleado[2].setSalario(3000);
        
        
        empleado[3]=new Operaciones();
        empleado[3].setNombre("Ana Hernandez");
        empleado[3].setNumEmp(004);
        empleado[3].setPuesto("Operaciones");
        empleado[3].setSalario(4000);
        
        float isr=0.0f;
        for(int i=0;i<empleado.length;i++)
        {
            isr=empleado[i].calcularISR();
            System.out.println("Nombre: "+empleado[i].getNombre());
            System.out.println("Num. Empleado: "+empleado[i].getNumEmp());
            System.out.println("Puesto: "+empleado[i].getPuesto());
            System.out.println("Salario: "+empleado[i].getSalario());
            System.out.println("ISR DE ["+empleado[i].getClass()+"]: "+isr);
            System.out.println("Método adicional: ");
            if(empleado[i] instanceof Analista)
            {
                System.out.println(((Analista)empleado[i]).fecha_revision_reporte_analista());
            }
            else
            {
                if(empleado[i] instanceof Director)
                {
                    System.out.println(((Director)empleado[i]).fecha_revision_reporte_directivo());
                }
                else
                {
                    if(empleado[i] instanceof Gerente)
                    {
                        System.out.println(((Gerente)empleado[i]).fecha_revision_reporte_gerente());
                    }
                    else
                    {
                        System.out.println(((Operaciones)empleado[i]).fecha_revision_reporte_operaciones());
                    }
                }
            }
            System.out.println("\n\n");
        }
        
        
    }
}
