
package Tarea2;

public class Triangulo implements FiguraGeometrica
{
    private int lado;
    private String color;
    
    public Triangulo(int lado)
    {
        this.lado=lado;
    }
    @Override
    public float perimetro()
    {
        return 3*this.lado;
    }
    @Override
    public float area()
    {
        return (float) ((Math.sqrt(3*this.lado*this.lado))*4);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String color() {
        return this.color;
    }
}
