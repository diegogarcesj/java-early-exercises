/**
 * Pide una base y un exponente entero positivo, y calcula la potencia.
 * 
 * @author Diego Garcés Jiménez
 */

public class BaseExponente {
	public static void main(String[] args) {
		
		System.out.print("Introduzca una base: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca un exponente entero positivo: ");
		int exp = Integer.parseInt(System.console().readLine());
		
		int pot = 1;
		for (int i = 1; i <= exp; i++) {
			pot *= base; // Equivale a pot = pot * base
		}
		
		System.out.println("Resultado de la potencia: " + pot);
	}
}
