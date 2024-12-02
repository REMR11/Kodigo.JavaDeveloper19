package Ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombre;
    private double precio;
    private double TASA_IMPUESTO = 0.19; // IVA del 19%
    // Lista para almacenar productos

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTASA_IMPUESTO() {
        return TASA_IMPUESTO;
    }

    public void setTASA_IMPUESTO(double TASA_IMPUESTO) {
        this.TASA_IMPUESTO = TASA_IMPUESTO;
    }

    // Metodo main para ejecutar el programa
    public static void main(String[] args) {
        // Crear productos
        Producto productoA = new Producto("Producto A", 100.0);
        Producto productoB = new Producto("Producto B", 200.0);

    }
}