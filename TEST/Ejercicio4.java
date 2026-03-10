/*Ejercicio 4: Mayor de tres números
🎯 Objetivo: Uso de condicionales anidados o Math.max.
Pide tres números e imprime cuál es el mayor.
💡 Extra: Indica si hay números iguales entre ellos.
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int n3 = scanner.nextInt();
        
        int mayor = Math.max(n1, Math.max(n2, n3));
        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}
