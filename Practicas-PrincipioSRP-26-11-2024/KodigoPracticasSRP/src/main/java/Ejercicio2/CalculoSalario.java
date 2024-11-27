package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class CalculoSalario {
    // Metodo para calcular salario total (otra responsabilidad)
    public double calcularSalarioTotal(List<Empleado> empleados) {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getSalario();
        }
        return total;
    }
}
