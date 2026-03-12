/*Ejercicio 6: Tabla de multiplicar
🎯 Objetivo: Bucles y formato de salida.
Pide un número y muestra su tabla de multiplicar del 1 al 10.
💡 Extra: Permite al usuario elegir hasta qué número mostrar la tabla. */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa un número: ");
    int n = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }
    scanner.close();
}
}
