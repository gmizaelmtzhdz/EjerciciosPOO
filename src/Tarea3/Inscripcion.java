package Tarea3;

import java.util.Random;

public class Inscripcion
{
    private int cantidad_alumnos;
    private Random rn = new Random();
    
    public Inscripcion(int cantidad_alumnos)
    {
        this.cantidad_alumnos=cantidad_alumnos;
    }
    public void inscribir()
    {
        int ultimo_digito_matricula=-1;
        String dia_inscripcion="";
        
        for(int i=0;i<this.cantidad_alumnos;i++)
        {
            ultimo_digito_matricula=this.generar_ultimo_digito_matricula();
            switch(ultimo_digito_matricula)
            {
                case 0: case 1:
                    dia_inscripcion="Lunes";
                    break;
                case 2: case 3:
                    dia_inscripcion="Martes";
                    break;
                case 4: case 5:
                    dia_inscripcion="Miércoles";
                    break;
                case 6: case 7:
                    dia_inscripcion="Jueves";
                    break;
                case 8: case 9:
                    dia_inscripcion="Viernes";
                    break;
            }
            System.out.println("Alumno "+(i+1)+", con ultimo dígito de matrícula: ["+ultimo_digito_matricula+"], día de inscripción: "+dia_inscripcion);
        }
    }
    private int generar_ultimo_digito_matricula()
    {
       return (this.getRn().nextInt(10));
    }
    /**
     * @return the cantidad_alumnos
     */
    public int getCantidad_alumnos() {
        return cantidad_alumnos;
    }

    /**
     * @param cantidad_alumnos the cantidad_alumnos to set
     */
    public void setCantidad_alumnos(int cantidad_alumnos) {
        this.cantidad_alumnos = cantidad_alumnos;
    }

    /**
     * @return the rn
     */
    public Random getRn() {
        return rn;
    }

    /**
     * @param rn the rn to set
     */
    public void setRn(Random rn) {
        this.rn = rn;
    }
    
}
