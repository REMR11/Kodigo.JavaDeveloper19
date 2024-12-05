package Ejercicio1;

public class ProductoDigital  extends  Producto{
    private double descuento; // Solo relevante para productos digitales

    public ProductoDigital(String nombre, double precioBase, double descuento) {
        super(nombre, precioBase);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() * (1 - descuento / 100);
    }
}
