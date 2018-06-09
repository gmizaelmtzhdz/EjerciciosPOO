package Sesion2;
/**
 *
 * Clase de prueba de los vehiculos
 */
public class PruebaVehiculos {
    public static void main(String[] args)
    {
        Compacto c1=new Compacto("123ABC","RSA123",2);
        Compacto c2=new Compacto("456DEF","RSA456",4);
        
        Camioneta c3=new Camioneta("789GHI","RSA789","media tonelada");
        Camioneta c4=new Camioneta("123DEF","RSA1234","una tonelada");
        
        Deportivo d1=new Deportivo("456XYZ","RSA4567",17);
        
        System.out.println("Información de compactos");
        System.out.println("Rendimiento de gasolina: "+c1.rendGas());
        System.out.println("Costo de mantenimiento: "+c1.costoMant());
        System.out.println("Numero de puertas: "+c1.getNum_puertas());
         System.out.println("Numero de serie: "+c1.getNum_serie());
        System.out.println("Matrícula: "+c1.getMatricula());
        System.out.println("\n----------------------------------\n");
        System.out.println("Rendimiento de gasolina: "+c2.rendGas());
        System.out.println("Costo de mantenimiento: "+c2.costoMant());
        System.out.println("Numero de puertas: "+c2.getNum_puertas());
        System.out.println("Numero de serie: "+c2.getNum_serie());
        System.out.println("Matrícula: "+c2.getMatricula());
        
        System.out.println("\n===================================\n");
        System.out.println("Información de camionetas");
        System.out.println("Rendimiento de gasolina: "+c3.rendGas());
        System.out.println("Costo de mantenimiento: "+c3.costoMant());
         System.out.println("Numero de serie: "+c3.getNum_serie());
        System.out.println("Matrícula: "+c3.getMatricula());
        System.out.println("\n----------------------------------\n");
        System.out.println("Rendimiento de gasolina: "+c4.rendGas());
        System.out.println("Costo de mantenimiento: "+c4.costoMant());
         System.out.println("Numero de serie: "+c4.getNum_serie());
        System.out.println("Matrícula: "+c4.getMatricula());
        
        System.out.println("\n===================================\n");
        System.out.println("Información de deportivos");
         System.out.println("Rendimiento de gasolina: "+d1.rendGas());
        System.out.println("Costo de mantenimiento: "+d1.costoMant());
        System.out.println("Medida del rin :"+d1.getRin());
         System.out.println("Numero de serie: "+d1.getNum_serie());
        System.out.println("Matrícula: "+d1.getMatricula());
    }
}
