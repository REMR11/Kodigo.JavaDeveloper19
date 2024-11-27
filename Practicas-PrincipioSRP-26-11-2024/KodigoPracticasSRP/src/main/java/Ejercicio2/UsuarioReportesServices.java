package Ejercicio2;

import java.util.List;

public class UsuarioReportesServices {
    // Metodo para generar reporte (viola SRP)
    public void generarReporte(List<Empleado> empleados) {
        System.out.println("--- REPORTE DE EMPLEADOS ---");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() +
                    " - Salario: $" + empleado.getSalario());
        }
    }
}
