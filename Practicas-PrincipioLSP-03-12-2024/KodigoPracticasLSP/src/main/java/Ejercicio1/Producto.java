package Ejercicio1;

public class Producto {
    private String nombre;
    private double precioBase;
    private String tipo; // "fisico" o "digital"
    private double peso; // Solo relevante para productos físicos
    private double descuento; // Solo relevante para productos digitales

    public Producto(String nombre, double precioBase, String tipo, double peso, double descuento) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.peso = peso;
        this.descuento = descuento;
    }

    public double calcularPrecio() {
        if (tipo.equalsIgnoreCase("fisico")) {
            return precioBase + (peso * 0.5); // Ejemplo: 0.5 por cada kg
        } else if (tipo.equalsIgnoreCase("digital")) {
            return precioBase * (1 - descuento / 100);
        } else {
            throw new IllegalArgumentException("Tipo de producto no válido");
        }
    }

    public String getNombre() {
        return nombre;
    }
}