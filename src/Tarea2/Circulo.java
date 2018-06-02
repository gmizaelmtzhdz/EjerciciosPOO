package Tarea2;
public class Circulo implements FiguraGeometrica{
    private int radio;
    private String color;
    
    public Circulo(int radio)
    {
        this.radio=radio;
    }
    @Override
    public float perimetro()
    {
        return (float) (2*Math.PI*this.radio);
    }
    @Override
    public float area()
    {
        return (float) (Math.PI*this.radio*this.radio);
    }
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
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
