/**
 * Pide números hasta que se introduce un negativo, y nos dice cuántos 
 * números se introdujeron, la media de los impares y el mayor de los pares.
 * 
 * @author Diego Garcés Jiménez
 */

public class NumerosMediaImparesMayorPares {
	public static void main(String[] args) {
		System.out.println("Introduzca números positivos (para detenerse introduzca uno negativo): ");
		
		int cantidad = 0;
		int cantImpar = 0;
		int sumaImpar = 0;
		double media;
		int mayorPar = 0;
		int numero;
		
		do {
			numero = Integer.parseInt(System.console().readLine());
			if (numero >= 0) {
				cantidad++;
				if (numero % 2 != 0) {
					cantImpar++;
					sumaImpar += numero;
				} else if(numero % 2 == 0) {
					if (numero > mayorPar) {
						mayorPar = numero;
					}
				}
			}
		} while (numero >= 0);
		
		System.out.println("La cantidad de numeros es " + cantidad);
		
		if (sumaImpar > 0) {
			media = (double)sumaImpar / cantImpar;
			System.out.println("La media de los impares es " + media);
		}
		
		if (mayorPar > 0) {
			System.out.println("El mayor de los pares es " + mayorPar);
		}
	}
}
