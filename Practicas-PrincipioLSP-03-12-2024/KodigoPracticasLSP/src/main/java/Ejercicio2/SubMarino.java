package Ejercicio2;

public class SubMarino extends  Vehiculo{
    public SubMarino(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public void mover() {
        System.out.println("Nada?");
    }

    @Override
    public int velocidadPromedio() {
        return 2;
    }

    @Override
    public String danioVehiculo() {
        return "Si, fue por Rusia";
    }
}
