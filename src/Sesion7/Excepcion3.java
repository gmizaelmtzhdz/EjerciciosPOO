package Sesion7;
import java.util.InputMismatchException;
import java.util.Scanner;
 
/**
 * Clase Excepcion3 muestra como se lanza y captura una excepcion de tipo
 * ArithmeticException y otra de tipo InputMismatchException
 */
public class Excepcion3 {
 
    // metodo division lanza una excepcion cuando ocurre
    // division entre cero
    public static float division(int a, int b) throws ArithmeticException {
        return a / b;
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continuar = true;
 
        do {
            try {
                System.out.println("Introducir el numerador:");
                int numerador = s.nextInt();
                System.out.println("Introducir el denominador:");
                int denominador = s.nextInt();
 
                float resultado = division(numerador, denominador);
                System.out.println("Resultado = " + resultado);
                continuar = false;
            } catch(InputMismatchException e1) {
                System.out.println("Capturando InputMismatchException");
                s.nextLine();
                System.out.println("Introducir los numeros de nuevo");
            } catch (ArithmeticException e2) {
                System.out.println("Capturando ArithmeticException");
                //e2.printStackTrace();
            }
 
        } while(continuar);
    }
}
