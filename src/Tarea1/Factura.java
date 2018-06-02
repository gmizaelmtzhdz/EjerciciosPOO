package Tarea1;
public class Factura
{
    //variables de instancia
    private String numero_factura;
    private String numero_serie_articulo;
    private String descripcion_articulo;
    private int cantidad_articulos_comprados;
    private double precio_articulo;
    //constructor
    public Factura(String numero_factura,String numero_serie_articulo,String descripcion_articulo,int cantidad_articulos_comprados,double precio_articulo)
    {
        this.numero_factura=numero_factura;
        this.numero_serie_articulo=numero_serie_articulo;
        this.descripcion_articulo=descripcion_articulo;
        this.cantidad_articulos_comprados=cantidad_articulos_comprados;
        this.precio_articulo=precio_articulo;
    }
    //métodos
    public double montoFactura()
    {
        return this.cantidad_articulos_comprados*this.precio_articulo;
    }

    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getNumero_serie_articulo() {
        return numero_serie_articulo;
    }

    public void setNumero_serie_articulo(String numero_serie_articulo) {
        this.numero_serie_articulo = numero_serie_articulo;
    }

    public String getDescripcion_articulo() {
        return descripcion_articulo;
    }

    public void setDescripcion_articulo(String descripcion_articulo) {
        this.descripcion_articulo = descripcion_articulo;
    }

    public int getCantidad_articulos_comprados() {
        return cantidad_articulos_comprados;
    }

    public void setCantidad_articulos_comprados(int cantidad_articulos_comprados) {
        this.cantidad_articulos_comprados = cantidad_articulos_comprados;
    }

    public double getPrecio_articulo() {
        return precio_articulo;
    }

    public void setPrecio_articulo(double precio_articulo) {
        this.precio_articulo = precio_articulo;
    }
}
