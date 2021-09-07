/**
 * Muestra por pantalla los números primos del 2 al 100.
 * 
 * @author Diego Garcés Jiménez
 */

public class NumerosPrimosDe2A100 {
	public static void main(String[] args) {
		
		boolean div = false;
		
		for (int i = 2; i <= 100; i++) { // Para cada numero del 2 al 100
			for (int j = 2; j < i; j++) { // Para cada divisor del 2 al numero menos 1
				if (i % j == 0) {	// Comprobamos si tiene divisores intermedios
					div = true;     // Si tiene divisores, marcamos true
				}
			}
			if (div == false) { //Si no tiene divisores, es primo
				System.out.print(i + " "); // Luego, se imprime.
			}
			div = false; // Reiniciamos la variable de los divisores
		}
	}
}
