/**
 * Muestra la cantidad de digitos de un número entero positivo o negativo.
 * 
 * @author Diego Garcés Jiménez
 */

public class CantidadDigitos {
	public static void main(String[] args) {
		
		System.out.print("Introduzca un número entero positivo o negativo: ");
		String snumero = System.console().readLine();
		int numero = Integer.parseInt(snumero);
		int cantidad = snumero.length();
		if (numero < 0) {
			cantidad--;
		}
		System.out.println("Número de digitos: " + cantidad);
	}
}
