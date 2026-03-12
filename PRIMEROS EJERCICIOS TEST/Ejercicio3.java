
/*Ejercicio 3: Número par o impar
🎯 Objetivo: Uso de if y operadores lógicos.
Pide al usuario un número entero y muestra si es par o impar.
💡 Extra: Indica también si es positivo, negativo o cero. */

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        double n = scanner.nextDouble();
        if (n % 2 == 0) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es impar");
        }

        if(n > 0 ){
            System.err.println("Es positivo");
        } else if (n < 0){
            System.out.println("Es negativo");
        } else {
            System.err.println("Es Cero");
        }

        scanner.close();
    }
}
