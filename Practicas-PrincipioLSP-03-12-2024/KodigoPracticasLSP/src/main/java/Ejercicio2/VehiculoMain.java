package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehiculoMain {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos =  new ArrayList<>();

        vehiculos.add(new SubMarino("Sub - Marino 1", "Ocupado por la Marina"));
        vehiculos.add(new Avion("Avion 1", "Posiblemente vuele... algun dia"));
        vehiculos.add(new Moto("MT-09", "Solo para valientes"));
        vehiculos.add(new Auto("Toyota", "Tiene ruedas, muchar ruedas"));

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }

        System.out.println("Fin del programa");
    }
}
