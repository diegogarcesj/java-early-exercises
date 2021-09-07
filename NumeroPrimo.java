/**
 * Determina si un número introducido por teclado es o no es un número primo.
 *
 * @author Diego Garcés Jiménez
 */

public class NumeroPrimo {
	public static void main(String[] args) {
		
		boolean div = false;
		
		System.out.print("Introduzca un número: ");
		int numero = Integer.parseInt(System.console().readLine());
				
		for (int i = 2; i < numero; i++) { // Excluimos los casos 1 y el numero.
			if ((numero % i == 0)) { // Comprueba si tiene divisores intermedios
				div = true;			// Si tiene uno, lo marca
			}
		}
		
		if (div == false) {  // Si no encontró divisores, es primo
			System.out.println("Es un número primo");
		} else if (div == true) { //Si tiene divisores intermedios, no es primo
			System.out.println("No es un número primo");
		}
	}
}
