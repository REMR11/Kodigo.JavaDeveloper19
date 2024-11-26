package Ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombre;
    private double precio;
    private static final double TASA_IMPUESTO = 0.19; // IVA del 19%

    // Lista para almacenar productos
    private static List<Producto> productos = new ArrayList<>();

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        agregarProducto(this);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Metodo para agregar producto y enviar notificación
    private void agregarProducto(Producto producto) {
        productos.add(producto);
        enviarNotificacion("Nuevo producto agregado: " + producto.getNombre() +
                " - Precio: $" + producto.getPrecio());
    }

    // Metodo de cálculo de impuestos
    public double calcularPrecioConImpuesto() {
        double precioConImpuesto = precio * (1 + TASA_IMPUESTO);
        enviarNotificacion("Precio con impuesto calculado para " + nombre +
                ": $" + precioConImpuesto);
        return precioConImpuesto;
    }

    // Metodo de notificación
    private void enviarNotificacion(String mensaje) {
        // Simulación de envío de notificación
        System.out.println("Notificación: " + mensaje);
    }

    // Metodo main para ejecutar el programa
    public static void main(String[] args) {
        // Crear productos
        Producto productoA = new Producto("Producto A", 100.0);
        Producto productoB = new Producto("Producto B", 200.0);

        // Calcular precios con impuestos
        for (Producto producto : productos) {
            double precioConImpuesto = producto.calcularPrecioConImpuesto();
            System.out.println("Precio final de " + producto.getNombre() + ": $" + precioConImpuesto);
        }
    }
}