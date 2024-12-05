package Ejercicio1;

public class ProductoFisico extends Producto{
    private double peso; // Solo relevante para productos físicos

    public ProductoFisico(String nombre, double precioBase, double peso) {
        super(nombre, precioBase);
        this.peso = peso;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() + (peso * 0.5); // Ejemplo: 0.5 por cada kg
    }

}
