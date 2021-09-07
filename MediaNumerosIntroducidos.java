/**
 * Calcula la media de un conjunto de números positivos introducidos por teclado.
 * Terminará cuando se introduzca un número negativo.
 *
 * @author Diego Garcés Jiménez
 */

public class MediaNumerosIntroducidos {
	public static void main(String[] args) {
		
		double numero;
		double suma = 0;
		int div = 0;
		double media;
		
		System.out.println("Introduzca números positivos; cuando termine, introduzca uno negativo:");
		
		do {
			numero = Double.parseDouble(System.console().readLine());
			if (numero >= 0) {
				suma += numero; // Equivale a suma = suma + numero
				div++; // Incrementa el divisor
			}
		} while (numero >= 0);
			
		if (suma > 0) {
			media = suma / div; // Calcula la media
			System.out.println("La media es " + media);
		} else {
			System.out.println("No se introdujeron números positivos válidos");
		}
	}
}
