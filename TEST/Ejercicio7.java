
/*Ejercicio 7: Números pares entre 1 y 100
🎯 Objetivo: Bucles y condiciones.
Imprime todos los números pares entre 1 y 100.
💡 Extra: Cuenta cuántos pares hay y muéstralo al final. */

public class Ejercicio7 {
        public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print("\n" + i);
            }
        }
    }
}
