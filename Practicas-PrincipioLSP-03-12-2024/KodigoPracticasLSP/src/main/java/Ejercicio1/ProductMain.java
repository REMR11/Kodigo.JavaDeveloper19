package Ejercicio1;

public class ProductMain {
    public static void main(String[] args) {
        Producto productoFisico = new ProductoFisico("Laptop", 1000.0,2.5);
        Producto productoDigital = new ProductoDigital("E-book", 20.0,  10.0);

        System.out.println("Precio del Producto Físico: " + productoFisico.calcularPrecio());
        System.out.println("Precio del Producto Digital: " + productoDigital.calcularPrecio());
    }
}

