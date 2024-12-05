package Ejercicio2;

public abstract class Vehiculo {
    private String nombre; // tesla
    private String descripcion; // El Auto

    public Vehiculo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract void mover();
    public abstract int velocidadPromedio();
    public abstract String danioVehiculo();

    @Override
    public String toString() {
        return "Vehiculo\n" +
                "\tnombre: " + nombre + "\n" +
                "\tdescripcion: " + descripcion + "\n" +
                "\tvelocidad promedio: "+ velocidadPromedio() + "\n"+
                "\tvehiculo daniado: " + danioVehiculo()
                ;
    }
}
