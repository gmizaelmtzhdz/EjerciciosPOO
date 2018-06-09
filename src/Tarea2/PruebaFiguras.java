package Tarea2;
public class PruebaFiguras
{
    public static void main(String[] args)
    {
        Circulo circulo1=new Circulo(4);
        Circulo circulo2=new Circulo(12);
        Circulo circulo3=new Circulo(23);
        
        circulo1.setColor("verde");
        circulo2.setColor("azul");
        circulo3.setColor("rojo");
        
        
        
        
        Cuadrado cuadrado1=new Cuadrado(5);
        Cuadrado cuadrado2=new Cuadrado(17);
        Cuadrado cuadrado3=new Cuadrado(30);
        
        cuadrado1.setColor("blanco");
        cuadrado2.setColor("azul");
        cuadrado3.setColor("rojo");
        
        
        
        
        
        Triangulo triangulo1=new Triangulo(3);
        Triangulo triangulo2=new Triangulo(18);
        Triangulo triangulo3=new Triangulo(41);
        
        triangulo1.setColor("rojo");
        triangulo2.setColor("verde");
        triangulo3.setColor("blanco");
        
        
        
        
        Trapecio trapecio1=new Trapecio(2.0,5.0,3.0,3.0,3.0);
        Trapecio trapecio2=new Trapecio(3.0,6.0,4.0,6.0,8.0);
        Trapecio trapecio3=new Trapecio(4.0,6.0,5.0,7.0,9.0);
        
        trapecio1.setColor("blanco");
        trapecio2.setColor("naranja");
        trapecio3.setColor("rojo");
        
        
        System.out.println("Datos de Círculo ");
        System.out.println("Circulo #1: perimetro: "+circulo1.perimetro()+", area: "+circulo1.area()+", color: "+circulo1.getColor());
        System.out.println("Circulo #2: perimetro: "+circulo2.perimetro()+", area: "+circulo2.area()+", color: "+circulo2.getColor());
        System.out.println("Circulo #3: perimetro: "+circulo3.perimetro()+", area: "+circulo3.area()+", color: "+circulo3.getColor());
      
        System.out.println("Datos de Cuadrado ");
        System.out.println("Cuadrado #1: perimetro: "+cuadrado1.perimetro()+", area: "+cuadrado1.area()+", color: "+cuadrado1.getColor());
        System.out.println("Cuadrado #2: perimetro: "+cuadrado2.perimetro()+", area: "+cuadrado2.area()+", color: "+cuadrado2.getColor());
        System.out.println("Cuadrado #3: perimetro: "+cuadrado3.perimetro()+", area: "+cuadrado3.area()+", color: "+cuadrado3.getColor());
      
        System.out.println("Datos de Triangulo ");
        System.out.println("Triangulo #1: perimetro: "+triangulo1.perimetro()+", area: "+triangulo1.area()+", color: "+triangulo1.getColor());
        System.out.println("Triangulo #2: perimetro: "+triangulo2.perimetro()+", area: "+triangulo2.area()+", color: "+triangulo2.getColor());
        System.out.println("Triangulo #3: perimetro: "+triangulo3.perimetro()+", area: "+triangulo3.area()+", color: "+triangulo3.getColor());
      
        System.out.println("Datos de Trapecio ");
        System.out.println("Trapecio #1: perimetro: "+trapecio1.perimetro()+", area: "+trapecio1.area()+", color: "+trapecio1.getColor());
        System.out.println("Trapecio #2: perimetro: "+trapecio2.perimetro()+", area: "+trapecio2.area()+", color: "+trapecio2.getColor());
        System.out.println("Trapecio #3: perimetro: "+trapecio3.perimetro()+", area: "+trapecio3.area()+", color: "+trapecio3.getColor());
      
    }
}
