package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private double salario;
    private static List<Empleado> empleados = new ArrayList<>(); // Lista estática para almacenar empleados

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        empleados.add(this); // Agregar este empleado a la lista al crear la instancia
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para generar reporte de empleados
    public static void generarReporte() {
        System.out.println("--- REPORTE DE EMPLEADOS ---");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() +
                    " - Salario: $" + empleado.getSalario());
        }
    }

    // Método para calcular salario total
    public static double calcularSalarioTotal() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getSalario();
        }
        return total;
    }

    public static void main(String[] args) {
        // Crear empleados
        new Empleado("Juan Pérez", 50000);
        new Empleado("Ana Gómez", 60000);

        // Generar reporte y calcular salario total
        generarReporte();
        System.out.println("Salario total: $" + calcularSalarioTotal());
    }
}