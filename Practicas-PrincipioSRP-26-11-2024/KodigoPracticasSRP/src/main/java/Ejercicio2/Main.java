package Ejercicio2;

public class Main {
    public static void main(String[] args) {


        EmpleadoRepository gestor = new EmpleadoRepository();

        gestor.agregarEmpleado("Juan Pérez", 50000);
        gestor.agregarEmpleado("Ana Gómez", 60000);

        UsuarioReportesServices  myService = new UsuarioReportesServices();
        myService.generarReporte(gestor.empleados);
//        System.out.println("Salario total: $" +  );
    }
}
