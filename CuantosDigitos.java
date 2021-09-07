/**
 * Dice cuántos digitos tiene un número introducido por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class CuantosDigitos {
	public static void main(String[] args) {
		
		int cantidad = 0;
		
		System.out.print("Introduzca un número: ");
		int numero = Integer.parseInt(System.console().readLine());
			
		while ( numero > 0 ) {
			numero /= 10; // Equivale a numero = numero / 10
			cantidad++;
		}
		
		System.out.println("El número introducido tiene " + cantidad + " dígitos.");
	}
}
			
