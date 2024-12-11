package ejercicios_streams;

import ejercicios_streams.Models.Product;
import ejercicios_streams.Models.Products;
import ejercicios_streams.ejercicio01.ElementOperations;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        ElementOperations elementOperations = new ElementOperations();

        // Obtener y mostrar la lista de productos
        List<Product> products = Products.productList;
        System.out.println("Lista de productos:");
        products.forEach(System.out::println);

        // Llamar a los métodos de ElementOperations
        elementOperations.firstElement();
        elementOperations.firstMatchingElement();
        elementOperations.maybeFirstElement();
        elementOperations.maybeFirstMatchingElement();
        elementOperations.elementAtPosition();
    }
}
