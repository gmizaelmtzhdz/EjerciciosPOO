package Tarea1;
public class Circulo {
    //variables de instancia
   private int radio; 
   
   //métodos
   public Circulo(int radio)
   {
       this.radio=radio;
   }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
   
   
   public float perimetro()
   {
       return (float) (2*Math.PI*this.radio);
   }
   public float area()
   {
       return (float) (Math.PI*this.radio*this.radio);
   }
}

