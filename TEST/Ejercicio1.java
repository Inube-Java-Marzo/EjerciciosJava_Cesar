
/** Ejercicio 1: Hola, programador
Crea un programa que pida tu nombre y edad por consola, y luego imprima un mensaje como
"Hola, Carlos. Tienes 25 años. ¡Bienvenido a Java!"
💡 Extra: Calcula en qué año de nacimiento y muéstralo también.
"Hola, Carlos. Tienes 25 años. ¡Bienvenido a Java!, naciste en el año 2000"  */
import java.time.Year;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        int año = Year.now().getValue();
        int añoNacimiento = año - edad;
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años. ¡Bienvenido a Java!, " + " naciste en el año " + añoNacimiento);
        
        scanner.close();
    }
}