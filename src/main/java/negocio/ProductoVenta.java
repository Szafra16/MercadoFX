package negocio;

public class ProductoVenta  {

    int cantidad;



    int subtotal;
    Producto productoVender;

    public ProductoVenta(Producto producto,int cantidad) {
        this.cantidad = cantidad;
        this.productoVender = producto;
        this.CalcularSubtotal();
    }

    public void CalcularSubtotal() {
        subtotal = cantidad * this.productoVender.getPrecio_unitario();
    }

    public int getSubtotal() {
        return subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }
    public int getPrecio_unitario() {
        return this.productoVender.getPrecio_unitario();
    }

    public int getID() {
        return this.productoVender.getCodigo();
    }
    public String getDescripcion(){return this.productoVender.getDescripcion();}

}
