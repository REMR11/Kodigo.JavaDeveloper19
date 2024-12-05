package Ejercicio2;

public class Moto extends Vehiculo{

    public Moto(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public void mover() {
        System.out.println("Si se mueve");
    }

    @Override
    public int velocidadPromedio() {
        return 100;
    }

    @Override
    public String danioVehiculo() {
        return "No esta daniado";
    }
}
