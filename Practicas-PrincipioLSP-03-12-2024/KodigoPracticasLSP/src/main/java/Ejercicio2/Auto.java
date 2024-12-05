package Ejercicio2;

public class Auto extends Vehiculo {
    public Auto(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public void mover() {
        System.out.println("Si, pero necesita gasolina");
    }

    @Override
    public int velocidadPromedio() {
        return 110;
    }

    @Override
    public String danioVehiculo() {
        return "No esta daniado";
    }
}
