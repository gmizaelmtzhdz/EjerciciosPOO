package Tarea2;
public class Trapecio implements FiguraGeometrica
{
    private double base1;
    private double base2;
    private double altura;
    private double ladoizquierdo;
    private double ladoderecho;
    private String color;
    
    public Trapecio(double base1, double base2, double altura, double ladoizquierdo, double ladoderecho)
    {
        this.base1=base1;
        this.base2=base2;
        this.altura=altura;
        this.ladoizquierdo=ladoizquierdo;
        this.ladoderecho=ladoderecho;
    }
    @Override
    public float perimetro() {
        return (float) (this.base1+this.base2+this.ladoderecho+this.ladoizquierdo);
    }

    @Override
    public float area() {
        return (float) (this.altura * ((this.base1 + this.base2)/2));
    }

    @Override
    public String color() {
        return this.color;
    }
}
