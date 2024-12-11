package ejercicios_streams.ejercicio01;

import ejercicios_streams.Models.Product;
import ejercicios_streams.Models.Products;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ElementOperations {

    public List<Product> getProductList() {
        return Products.productList;
    }

    /**
     * Dada una lista de productos, utiliza Streams para encontrar el primer producto cuyo ID sea igual a 12.
     * Si existe, imprime el producto; de lo contrario, imprime null.
     */
    public void firstElement() {
        // Implementar aquí
        List<Product> products = getProductList();

    }

    /**
     * Dado un arreglo de cadenas que representan números en inglés, utiliza Streams para encontrar la primera cadena
     * que comience con la letra 'o'. Imprime el resultado, o null si no existe.
     */
    public void firstMatchingElement() {
        String[] strings = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        // Implementar aquí

    }

    /**
     * Dado un arreglo de números enteros que podría estar vacío, utiliza Streams para obtener el primer número
     * del arreglo. Si no hay elementos, devuelve el valor predeterminado 0 e imprímelo.
     */
    public void maybeFirstElement() {
        // Implementar aquí
        int[] numbers = {};
    }

    /**
     * Dada una lista de productos, utiliza Streams para buscar el primer producto cuyo ID sea igual a 789.
     * Imprime si el producto existe (true) o no (false).
     */
    public void maybeFirstMatchingElement() {
        // Implementar aquí
    }

    /**
     * Dado un arreglo de números enteros, utiliza Streams para encontrar el segundo número que sea mayor que 5.
     * Si no hay suficientes números que cumplan la condición, devuelve 0. Imprime el resultado.
     */
    public void elementAtPosition() {
        // Implementar aquí
    }
    /**
    * Dada una lista de productos, utiliza Streams para encontrar los productos con stock mas bajo.
     * devuelve una lista con esos productos.
    * */
    public void lowStockProducts() {
        // Implementar aquí
    }

    /**
     * Dado una lista de Productos, buscar el producto mas caro utilizando streams
     * Devuelve el producto.
     * */
    public void mostExpensiveProduct() {
        // Implementar aquí
    }

}
