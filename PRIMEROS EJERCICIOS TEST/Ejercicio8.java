
/*Ejercicio 8: Suma hasta que el usuario diga “no”
🎯 Objetivo: Uso de bucle while y condiciones lógicas.
El programa debe pedir números y sumarlos hasta que el usuario escriba “no” para terminar.
💡 Extra: Muestra cuántos números ingresó el usuario.*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sumar = 0;
    String terminar;

    do {
        System.out.print("Ingresa números que quieras sumar: ");
        int numero = scanner.nextInt();
        sumar += numero; 
        scanner.nextLine();
        System.out.print("¿Deseas continuar?");
        System.out.print("\n Presiona la tecla Enter para seguir sumando");
        System.out.print("\n Escribe la palabra (no) para terminar");
        System.out.println("\n");
        terminar = scanner.nextLine().trim().toLowerCase();
    } while (!terminar.equals("no"));
    System.out.println("La suma total de tus numeros son: " + sumar);
    scanner.close();
    }
}
