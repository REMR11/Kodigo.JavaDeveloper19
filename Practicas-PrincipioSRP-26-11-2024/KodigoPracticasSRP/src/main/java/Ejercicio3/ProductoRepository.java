package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepository {
    private  NotificacionProducto notificaion = new NotificacionProducto();

    private static List<Producto> productos = new ArrayList<>();
    // Metodo para agregar producto y enviar notificación
    private void agregarProducto(Producto producto) {
        productos.add(producto);
        notificaion.enviarNotificacion("Nuevo producto agregado: " + producto.getNombre() +
                " - Precio: $" + producto.getPrecio());
    }

}
