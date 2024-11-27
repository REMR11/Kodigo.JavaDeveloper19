package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un empleado con un nombre y un salario.
 * Además, permite gestionar una lista de empleados y generar reportes sobre ellos.
 */
public class Empleado {
    private String nombre; // Nombre del empleado
    private double salario; // Salario del empleado
    private static List<Empleado> empleados = new ArrayList<>(); // Lista estática para almacenar empleados

    /**
     * Constructor que crea un nuevo empleado y lo agrega a la lista de empleados.
     *
     * @param nombre  El nombre del empleado.
     * @param salario El salario del empleado.
     */
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        empleados.add(this); // Agregar este empleado a la lista al crear la instancia
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el salario del empleado.
     *
     * @return El salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     *
     * @param salario El nuevo salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
}