
/*Ejercicio 5: Contador de números
🎯 Objetivo: Uso de bucles for y contadores.
Pide un número N y muestra todos los números del 1 al N.
💡 Extra: Muestra también la suma total de esos números. */

import java.util.Scanner;

public class Ejercicio5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();

        int total = 0;

        System.out.println("Los numeros son: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            total += i;
        }
        System.out.println();
        System.out.println("El total es: " + total);

        scanner.close();
    }
}
