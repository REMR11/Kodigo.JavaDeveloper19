package ejemplos_streams;

import java.util.*;

public class Streams {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        System.out.println("Ejemplo 01: Dada una lista de números enteros, filtra los números pares e imprímelos.");
        System.out.println("------------------------------------------------");

        List<Integer> numeros =Arrays.asList(1,2,3,4,5,6,7,8,9);


        System.out.println("------------------------------------------------");
        System.out.println("Ejemplo 02: Dada una lista de cadenas, conviértelas a mayúsculas usando streams.");
        System.out.println("------------------------------------------------");

        List<String> palabras = Arrays.asList("java", "stream", "programacion", "lambda");


        System.out.println("------------------------------------------------");
        System.out.println("Ejemplo 03: Dada una lista de números, ordénalos en orden descendente e imprímelos.");
        System.out.println("------------------------------------------------");


        List<Integer> numeros2 = Arrays.asList(5, 2, 8, 1, 9, 3);

        System.out.println("------------------------------------------------");
        System.out.println("Ejemplo 04: Dada una lista de números, calcula su suma usando el metodo reduce");
        System.out.println("------------------------------------------------");
        /**
         * Dada una lista de números, calcula su suma usando el metodo reduce.
         * */

        List<Integer> sumaNumeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("------------------------------------------------");
        System.out.println("Ejemplo 05:  Dada una lista de números, encuentra el número máximo usando max.");
        System.out.println("------------------------------------------------");

        List<Integer> numeroMaximo = Arrays.asList(3, 9, 2, 5, 8);

        System.out.println("------------------------------------------------");
        System.out.println("Ejemplo 06:  Dada una lista de números, realiza las siguientes operaciones en una sola línea:\n" +
                "\tFiltrar los números impares.\n" +
                "\tElevarlos al cuadrado.\n" +
                "\tSumarlos.");
        System.out.println("------------------------------------------------");
        List<Integer> operacionesCombinadas = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
