package Tarea1;
public class PruebaCirculo {
    public static void main(String[] args) {
        System.out.println("TAREA #1: Programación Orientada a Objetos");
        Circulo c1=new Circulo(12);
        Circulo c2=new Circulo(22);
        Circulo c3=new Circulo(8);
        Circulo c4=new Circulo(2);
        Circulo c5=new Circulo(85);
        
        
        System.out.println("Círculo con radio: ["+c1.getRadio()+"], tiene un perimetro de: ["+c1.perimetro()+"] y un área de: ["+c1.area()+"] ");
        System.out.println("Círculo con radio: ["+c2.getRadio()+"], tiene un perimetro de: ["+c2.perimetro()+"] y un área de: ["+c2.area()+"] ");
        System.out.println("Círculo con radio: ["+c3.getRadio()+"], tiene un perimetro de: ["+c3.perimetro()+"] y un área de: ["+c3.area()+"] ");
        System.out.println("Círculo con radio: ["+c4.getRadio()+"], tiene un perimetro de: ["+c4.perimetro()+"] y un área de: ["+c4.area()+"] ");
        System.out.println("Círculo con radio: ["+c5.getRadio()+"], tiene un perimetro de: ["+c5.perimetro()+"] y un área de: ["+c5.area()+"] ");
    }
}
