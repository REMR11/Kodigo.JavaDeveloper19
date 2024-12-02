package Ejercicio1;

public class ProductMain {
    public static void main(String[] args) {
        Producto productoFisico = new Producto("Laptop", 1000.0, "fisico", 2.5, 0);
        Producto productoDigital = new Producto("E-book", 20.0, "digital", 0, 10.0);

        System.out.println("Precio del Producto Físico: " + productoFisico.calcularPrecio());
        System.out.println("Precio del Producto Digital: " + productoDigital.calcularPrecio());
    }
}

