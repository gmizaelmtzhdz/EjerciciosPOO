package Tarea4;

public class Cliente {
    //fecha 
    private Fecha fecha;
        
    // variables de instancia
    private String nombre;
    private int numCuenta;
     
    // contador es una variable estatica
    public static int contador;
     
    // variables de instancia
    private int articulos;
    private double saldo;
     
    // variable descuento
    private double descuento;
    
    // constructor
    public Cliente(String nom, int arts) {
        //(int d, int m, int a)
        this.fecha=new Fecha(1,12,2018);
        nombre = nom;
        //contador = contador + 1;
        contador++;
        //++contador;
        this.numCuenta = contador;
        this.articulos = arts;
    }
 
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
 
    /**
     * @return the numCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }
 
    /**
     * @return the articulos
     */
    public int getArticulos() {
        return articulos;
    }
 
    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
 
    /**
     * @param saldo the saldo to set
     */
    // numero de articulos por 15 pesos
    public void setSaldo(int arts) {
        this.saldo = arts * 15;
    }
     
    // metodo estatico para conocer el total de clientes que han comprado
    public static int getTotalClientes() {
        return contador;
    }    
    
    //Comentario: método 1: 
    public void aplicar_descuento_cliente()
    {
        if(this.articulos>2)
        {
            this.descuento = (Math.random()*100);
        }
    }
    //Comentario: método 2: 
    public void aplicar_promocion_cliente()
    {
        //si es dia primero aplicar 2x1
        if(this.fecha.getDia()==1)
        {
            this.saldo=this.saldo/2;
        }
    }
    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }
    
}