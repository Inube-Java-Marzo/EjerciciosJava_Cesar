
/**
 * Clase principal del proyecto que muestra el uso de datos wrapper en Java. Muestra ejemplos de operaciones aritméticas, lógicas y conversiones
 *
 * @version 1.0
 * @author Uriel
 *
 */

public class Main {

    /**
     * Método principal de la aplicación
     *
     * @param args -Argumentos de línea de comandos (no se usa en esta
     * aplicación)
     */
    public static void main(String[] args) {

        // === Tipos de Datos Wrappers en Java ===
        // Son clases que representan primitivos como objetos
        // Con los primitivos los datos no son objetos
        // Los primitivos no pueden ser null (Esto es útil en bases de datos o APIs donde un valor puede no existir)

        /* PRIMITIVOS */
        // int a = 10;
        // int b = 10;
        // System.out.println(a == b); // true

        /* WRAPPER */
        // Integer a = 1000;
        // Integer b = 1000;
        // System.out.println(a == b); // false
        // Porque == compara referencias de objeto, no el valor
        /* ¿CUANDO USAR? */
        // Solo necesitas guardar valores
        // Cuando necesitas objetos (listas, métodos, null, etc.)
        // Byte
        Byte edad = 25;
        System.out.println("Byte edad = " + edad);
        System.out.println("Byte MAX_VALUE = " + Byte.MAX_VALUE);

        // Short
        Short anio = 2025;
        System.out.println("\nShort año = " + anio);
        System.out.println("Short MIN_VALUE = " + Short.MIN_VALUE);

        // Integer
        Integer poblacionCiudad = 1_500_000; // Se usan guiones bajos para mejorar la legibilidad (no afectan el valor)
        System.out.println("\nInteger población ciudad = " + poblacionCiudad);
        System.out.println("Integer parseInt(\"123\") = " + Integer.parseInt("123")); // String → int
        System.out.println("Integer toHexString(255) = " + Integer.toHexString(255)); // Decimal → Hex

        // Long
        Long poblacionMundial = 8_000_000_000L;
        System.out.println("\nLong población mundial = " + poblacionMundial);
        System.out.println("Long compare(100L, 200L) = " + Long.compare(100L, 200L)); // -1

        // Float
        Float precio = 99.99f;
        System.out.println("\nFloat precio = " + precio);
        System.out.println("Float isNaN(0.0f / 0.0f) = " + Float.isNaN(0.0f / 0.0f));

        // Double
        Double pi = 3.141592653589793;
        System.out.println("\nDouble pi = " + pi);
        System.out.println("Double valueOf(\"2.718\") = " + Double.valueOf("2.718"));

        // Character
        Character inicial = 'C';
        System.out.println("\nCharacter inicial = " + inicial);
        System.out.println("Character.isLetter('9') = " + Character.isLetter('9'));
        System.out.println("Character.toLowerCase('A') = " + Character.toLowerCase('A'));

        // Boolean
        Boolean esJavaGenial = Boolean.TRUE;
        System.out.println("\nBoolean es Java genial = " + esJavaGenial);
        System.out.println("Boolean.parseBoolean(\"false\") = " + Boolean.parseBoolean("false"));

        // === Operaciones con Wrappers ===
        System.out.println("\n=== Operaciones con Wrappers ===");

        Integer x = 10;
        Integer y = 20;

        // Autoboxing y unboxing
        /* Autoboxing es cuando Java convierte automáticamente un tipo primitivo en su objeto Wrapper */
        
        /* Unboxing es cuando Java convierte un objeto Wrapper en su tipo primitivo */
        // Java no puede sumar objetos Integer directamente, así que automáticamente unboxing convierte Integer a int
        // Realiza la suma
        // Guarda el resultado en suma
        int suma = x + y; // detrás de cámaras se desempaqueta (unboxing)
        System.out.println("Suma (x + y) = " + suma);

        // Comparaciones
        System.out.println("x.compareTo(y) = " + x.compareTo(y)); // -1
        System.out.println("x.equals(y) = " + x.equals(y));       // false

        // Conversión de tipos
        String str = x.toString();
        System.out.println("x.toString() = " + str);

        int numero = Integer.parseInt("1234");
        System.out.println("Integer.parseInt(\"1234\") = " + numero);
    }
}
