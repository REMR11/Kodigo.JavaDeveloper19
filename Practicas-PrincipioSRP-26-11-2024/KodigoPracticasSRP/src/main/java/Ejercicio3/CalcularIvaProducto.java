package Ejercicio3;


public class CalcularIvaProducto {
    private  NotificacionProducto notificaion = new NotificacionProducto();

    // Metodo de cálculo de impuestos
    public double calcularPrecioConImpuesto(Producto producto) {
        double precioConImpuesto = producto.getPrecio() * (1 + producto.getTASA_IMPUESTO());
        notificaion.enviarNotificacion("Precio con impuesto calculado para " + producto.getNombre() +
                ": $" + precioConImpuesto);
        return precioConImpuesto;
    }

}
