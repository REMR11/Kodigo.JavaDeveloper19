package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepository {
    protected List<Empleado> empleados;

    public EmpleadoRepository() {
        this.empleados = new ArrayList<>();
    }

    // Metodo para agregar empleados
    public void agregarEmpleado(String nombre, double salario) {
        Empleado nuevoEmpleado = new Empleado(nombre, salario);
        empleados.add(nuevoEmpleado);
    }
}
