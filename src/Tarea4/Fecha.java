package Tarea4;
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(int d, int m, int a)
    {
        this.setFecha(d, m, a);
    }
    
    public String getFecha()
    {
        return ((this.getDia())<10?("0"+this.getDia()):this.getDia())+"-"+((this.getMes())<10?("0"+this.getMes()):this.getMes())+"-"+this.getAño();
    }
    public void setFecha(int d, int m, int a)
    {
        boolean fecha_correcta=true;
        this.setDia(d);
        this.setMes(m);
        this.setAño(a);
        
        if(this.getDia()>0 && this.getMes()>0 && this.getMes()<13  && this.getAño()>0) 
        {
            boolean es_bisiesto=false;
            es_bisiesto=(this.getAño()%4==0);
            switch(this.getMes())
            {
                case 1: //Enero
                case 3: //Marzo
                case 5: //Mayo
                case 7: //Julio
                case 8: //Agosto
                case 10: //Octubre
                case 12: //Diciembre    
                    if(this.getDia()<=0 || this.getDia()>31)
                    {
                        fecha_correcta=false;
                        System.out.println("[Error] Los dias deben estar en el rango de 1-31");
                    }
                    break;
                
                case 4: //Abril
                case 6: //Junio
                case 9: //Septiembre 
                case 11: //Noviembre 
                    if(this.getDia()<=0 || this.getDia()>30)
                    {
                        fecha_correcta=false;
                        System.out.println("[Error] Los dias deben estar en el rango de 1-30");
                    }
                    break;
                    
                case 2: //Febrero
                    if(es_bisiesto)
                    {
                     if(this.getDia()<=0 || this.getDia()>29){
                        fecha_correcta=false;
                        System.out.println("[Error] Los dias deben estar en el rango de 1-29 (Bisiesto)");
                     }
                    }
                    else
                    {
                       if(this.getDia()<=0 || this.getDia()>28)
                       {
                           System.out.println("[Error] Los dias deben estar en el rango de 1-28 (NO es bisiesto)");
                           fecha_correcta=false;
                       }
                       
                    }
                    break;
            }
        }
        else
        {
            fecha_correcta=false;
            System.out.println("[Error] No debe contener valores negativos ó fuera de rango");
        }
        if(fecha_correcta)
        {
            //System.out.println("Fecha: "+this.getFecha());
        }
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }
    
}
