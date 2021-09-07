/** 
 * Muestra los número menores a uno introducido por teclado que no sean divisibles por otro introducido por teclado 
 * 
 * @author Diego Garcés Jiménez
 */

public class NoDivisibles {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero positivo: ");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca un divisor: ");
        int divisor = Integer.parseInt(System.console().readLine());

        System.out.println("Los números hasta " + numero + " NO divisibles por " + divisor + " son:");

        for (int i = 1; i < numero; i++) {
            if (i % divisor != 0) { // Si no es divisible por el divisor, se imprime.
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }
}