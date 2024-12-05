package Ejercicio2;

import Ejercicio1.Producto;

public class Avion extends Vehiculo{
    public Avion(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public void mover() {
        System.out.println("No se mueve, vuelaaa");
    }

    @Override
    public int velocidadPromedio() {
        return 300;
    }

    @Override
    public String danioVehiculo() {
        return "No daniado";
    }
}
