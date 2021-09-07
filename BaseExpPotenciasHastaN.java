/**
 * Muestra todas las potencias de una base hasta el exponente introducidos por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class BaseExpPotenciasHastaN {
	public static void main(String[] args) {
		
		System.out.print("Introduzca un número real como base: ");
		double base = Double.parseDouble(System.console().readLine());
		System.out.print("Introduzca un número entero positivo como exponente: ");
		int exp = Integer.parseInt(System.console().readLine());
		
		double pot = 1;
		for (int i = 1; i <= exp; i++) {
			pot *= base;
			System.out.print(pot + " ");
		}
	}
}
