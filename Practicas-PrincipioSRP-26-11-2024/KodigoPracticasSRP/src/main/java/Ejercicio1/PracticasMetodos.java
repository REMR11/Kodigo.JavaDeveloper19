package Ejercicio1;

public class PracticasMetodos {

    /**
     * Valida los datos de un usuario.
     *
     * Este metodo verifica que el nombre tenga al menos 2 caracteres, que la edad esté
     * dentro del rango de 18 a 120 años y que el email contenga un '@' y un '.'.
     *
     * @param nombre El nombre del usuario a validar.
     * @param edad La edad del usuario a validar.
     * @param email El correo electrónico del usuario a validar.
     * @return true si todas las validaciones son exitosas, false en caso contrario.
     */
    public boolean validarUsuario(String nombre, int edad, String email) {
        // Múltiples validaciones en un solo metodo.
        ValidarNombre(nombre);
        validarEdad(edad);
        validadEmail(email);
        return true;
    }

    private boolean ValidarNombre(String nombre){
        if (nombre == null || nombre.length() < 2) {
            System.out.println("Nombre inválido");
            return false;
        }
        return true;
    }

    private boolean validarEdad(int edad) {
        if (edad < 18 || edad > 120) {
            System.out.println("Edad fuera de rango");
            return false;
        }
        return true;
    }

    private boolean validadEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email inválido");
            return false;
        }
        return true;
    }

    /**
     * Procesa un texto eliminando espacios, convirtiéndolo a mayúsculas y eliminando
     * caracteres especiales.
     *
     * @param texto El texto a procesar.
     * @return El texto procesado, limpio de espacios y caracteres especiales, y en mayúsculas.
     */
    public String procesarTexto(String texto) {
        // Múltiples responsabilidades en un metodo
        // 1. Eliminar espacios
        verificarEspaciosNulos(texto);

        // 2. Convertir a mayúsculas
        convertirAMayusculas(texto);

        // 3. Eliminar caracteres especiales
        eliminarCaracteresEspeciales(texto);

        return texto;
    }

    private void verificarEspaciosNulos(String texto){ texto = texto.trim(); }

    private void convertirAMayusculas(String texto){ texto = texto.toUpperCase(); }

    private void eliminarCaracteresEspeciales(String texto){
        texto = texto.replaceAll("[^a-zA-Z0-9]", "");
    }


    /**
     * Formatea la información a un formato CSV.
     *
     * Este metodo elimina los espacios en blanco, convierte el texto a mayúsculas,
     * y genera un formato CSV a partir de los datos proporcionados.
     *
     * @param datos La cadena de datos a formatear.
     * @return Una cadena que representa los datos en formato CSV.
     */
    public String formatearInformacion(String datos) {
        // 1. Eliminar espacios en blanco
        datos = eliminarEspacios(datos);

        // 2. Convertir a mayúsculas
        datos = convertirAMayusculas2(datos);

        // 3. Crear formato CSV
        String[] partes = dividirporcomas(datos);

        StringBuilder csvFormateado = new StringBuilder();
        for (String parte : partes) {
            csvFormateado.append("\"").append(parte.trim()).append("\",");
        }

        return csvFormateado.toString().replaceAll(",$", "");
    }

    private String eliminarEspacios(String datos){ return datos.trim(); }
    private String convertirAMayusculas2(String datos){ return datos.toUpperCase(); }
    private String[] dividirporcomas(String datos){ return  datos.split(","); }


}