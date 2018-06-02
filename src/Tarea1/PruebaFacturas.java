package Tarea1;
public class PruebaFacturas
{
    public static void main(String[] args)
    {
        Factura factura1=new Factura("1", "111", "coca-cola 500ml",1,15);
        Factura factura2=new Factura("2", "222", "jabón",1,25);
        Factura factura3=new Factura("3", "333", "mazapan",3,5);
        Factura factura4=new Factura("4", "444", "agua embotellada",1,8);
        Factura factura5=new Factura("5", "555", "tortillas",3,12.5);
        
        System.out.println("Artículo: ["+factura1.getDescripcion_articulo()+"], Cantidad artículos: ["+factura1.getCantidad_articulos_comprados()+"], Precio artículo: ["+factura1.getPrecio_articulo()+"], Monto Factura: "+factura1.montoFactura());
        System.out.println("Artículo: ["+factura2.getDescripcion_articulo()+"], Cantidad artículos: ["+factura2.getCantidad_articulos_comprados()+"], Precio artículo: ["+factura2.getPrecio_articulo()+"], Monto Factura: "+factura2.montoFactura());
        System.out.println("Artículo: ["+factura3.getDescripcion_articulo()+"], Cantidad artículos: ["+factura3.getCantidad_articulos_comprados()+"], Precio artículo: ["+factura3.getPrecio_articulo()+"], Monto Factura: "+factura3.montoFactura());
        System.out.println("Artículo: ["+factura4.getDescripcion_articulo()+"], Cantidad artículos: ["+factura4.getCantidad_articulos_comprados()+"], Precio artículo: ["+factura4.getPrecio_articulo()+"], Monto Factura: "+factura4.montoFactura());
        System.out.println("Artículo: ["+factura5.getDescripcion_articulo()+"], Cantidad artículos: ["+factura5.getCantidad_articulos_comprados()+"], Precio artículo: ["+factura5.getPrecio_articulo()+"], Monto Factura: "+factura5.montoFactura());
    }
}
