package Tarea2;
public class Cuadrado implements FiguraGeometrica{
    private int lado;
    private String color;
    
    public Cuadrado(int lado)
    {
       this.lado=lado;
    }
    @Override
    public float perimetro()
    {
        return 4*this.lado;
    }
    @Override
    public float area()
    {
        return this.lado*this.lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String color() {
        return this.color;
    }
}
