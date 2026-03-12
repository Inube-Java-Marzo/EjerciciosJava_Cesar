/**
 *
 * Clase principal del proyecto que muestra el uso de datos primitivos en Java.
 * Muestra ejemplos con operaciones aritméticas, lógicas y conversiones
 *
 * @author Uriel
 * @version 1.0
 *
 */

public class Main {

  /**
   * Método principal de la aplicación
   *
   * @param args Argumentos de línea de comandos (no se usan en esta aplicación)
   */
  public static void main(String[] args) {

    // === Tipos de Datos Primitivos en Java ===

    // byte: Entero pequeño (-128 a 127), ocupa 1 byte (8 bits)
    byte edad = 25;
    System.out.println("byte edad = " + edad);

    // short: Entero mediano (-32,768 a 32,767), ocupa 2 bytes
    short anio = 2025;
    System.out.println("short año = " + anio);

    // int: Entero estándar (-2,147,483,648 a 2,147,483,647), ocupa 4 bytes
    int poblacionCiudad = 1500000;
    System.out.println("int población ciudad = " + poblacionCiudad);

    // long: Entero muy grande, ocupa 8 bytes
    long poblacionMundial = 8_000_000_000L; // nota la "L" al final
    //Se usa la "L" porque se puede confundir si es "l"
    System.out.println("long población mundial = " + poblacionMundial);

    // float: Número decimal de 32 bits (menos preciso que double)
    // Puede almacenar hasta 7 digitos despues de la coma
    float precio = 99.99f; // nota la "f" al final
    //float precio = (float) 99.99;
    System.out.println("float precio = " + precio);

    // double: Número decimal de 64 bits (más preciso)
    // Puede almacenar hasta 15 digitos despues de la coma
    double pi = 3.141592653589793;
    System.out.println("double pi = " + pi);

    // char: Carácter único en Unicode (16 bits)
    char inicial = 'C';
    System.out.println("char inicial = " + inicial);

    // boolean: Valor lógico true/false
    boolean esJavaGenial = true;
    System.out.println("boolean es Java genial = " + esJavaGenial);

    // === Operaciones Básicas ===
    int suma = edad + anio; // byte y short se convierten en int en operaciones
    System.out.println("\nOperación Suma: edad + año = " + suma);

    int resta = anio - edad; // byte y short se convierten en int en operaciones
    System.out.println("\nOperación Resta: año - edad = " + resta);

    double division = pi / 2;
    System.out.println("\nOperación División: pi / 2 = " + division);

    double multiplicacion = pi * 2;
    System.out.println("\nOperación Multiplicación: pi * 2 = " + multiplicacion);

    boolean comparacion = poblacionCiudad > 1_000_000;
    System.out.println("\n¿La población de la ciudad es mayor a 1,000,000? " + comparacion);

    // Convertir de un tipo a otro (casting)
    int precioEntero = (int) precio; // se trunca la parte decimal de 99.99f se convierte a 99
    System.out.println("\nCasting float → int, precioEntero = " + precioEntero);

  }

}