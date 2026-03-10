
/*Ejercicio 9: Adivina el número
🎯 Objetivo: Bucles, operadores relacionales y aleatorios.
Genera un número aleatorio entre 1 y 50. El usuario debe adivinarlo. Después de cada intento, muestra si el número es mayor o menor.
💡 Extra: Cuenta el número de intentos usados. */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random nRandom = new Random();

        int numero = nRandom.nextInt(50) + 1;
        int intento;
        int intentosUsados = 0;

        System.out.println("Adivina el número entre 1 y 50");

        do {
            System.out.print("Ingresa un número: ");
            intento = scanner.nextInt();
            intentosUsados++;
            if (intento < numero) {
                System.out.println("Es Mayor");
            } else if (intento > numero) {
                System.out.println("Es Menor");
            } else {
                System.out.println("Adivinaste el número");
                System.out.println("Intentos usados: " + intentosUsados);
            }

        } while (intento != numero);

        scanner.close();
    }
}
