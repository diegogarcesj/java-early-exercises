/**
 * Calcula el factorial de un número introducido por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class Factorial {
	public static void main(String[] args) {

		int factorial = 1;

		System.out.print("Introduzca un número entero positivo: ");
		int numero = Integer.parseInt(System.console().readLine());

		for (int i = 1; i <= numero; i++) {
			factorial *= i; // Equivale a factorial = factorial * i
		}

		System.out.println("El factorial de " + numero + " es " + factorial);
	}
}