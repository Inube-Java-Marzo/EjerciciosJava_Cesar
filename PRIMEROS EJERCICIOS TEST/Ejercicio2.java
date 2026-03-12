
/* Ejercicio 2: Calculadora simple
🎯 Objetivo: Operadores aritméticos y lectura de datos.
Solicita dos números y muestra:
La suma
La resta
La multiplicación
La división (manejando el caso de división entre 0)
💡 Extra: Permite al usuario elegir la operación mediante un menú (switch).*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Menú de opciones");
        System.out.println("1 = Suma");
        System.out.println("2 = Resta");
        System.out.println("3 = Multiplicación");
        System.out.println("4 = División");
        System.out.println("Selecciona una operacion:");
        int opcion = scanner.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("La suma es: " + (n1 + n2));
                break;
            case 2:
                System.out.println("La resta es: " + (n1 - n2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + (n1 * n2));
                break;
            case 4:
                int division = n1 / n2;
                System.out.println("La división es: " + division);
                break;
            default:
                System.out.println("Opcion no valida");
        }

        scanner.close();
    }
}
