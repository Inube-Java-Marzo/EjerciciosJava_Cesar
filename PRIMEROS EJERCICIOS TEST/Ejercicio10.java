
/*Ejercicio 10: Menú interactivo
🎯 Objetivo: Combinar while, switch y Scanner.
Crea un menú que muestre opciones como:
1️⃣ Sumar dos números
2️⃣ Restar
3️⃣ Multiplicar
4️⃣ Salir
El programa se repite hasta que el usuario elija salir.

💡 Extra: Usa un do-while para hacerlo más natural. */

import java.util.Scanner;

public class Ejercicio10 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("1 = Sumar dos números");
        System.out.println("2 = Restar");
        System.out.println("3 = Multiplicar");
        System.out.println("4 = Salir");
        System.out.print("Elige una opción: ");
        opcion = scanner.nextInt();

        int n1, n2, total;

        switch(opcion) {
            case 1:
                System.out.print("Ingresa el primer número: ");
                n1 = scanner.nextInt();
                System.out.print("Ingresa el segundo número: ");
                n2 = scanner.nextInt();
                total = n1 + n2;
                System.out.println(total);                    break;
            case 2:
                System.out.print("Ingresa el primer número: ");
                n1 = scanner.nextInt();
                System.out.print("Ingresa el segundo número: ");
                n2 = scanner.nextInt();
                total = n1 - n2;
                System.out.println(total);
                break;
            case 3:
                System.out.print("Ingresa el primer número: ");
                n1 = scanner.nextInt();
                System.out.print("Ingresa el segundo número: ");
                n2 = scanner.nextInt();
                total = n1 * n2;
                System.out.println(total);
                break;
            case 4:
                break;
            default:
                System.out.println("La opcion no es valida");
        }
        scanner.close();
    }
}
