/**
 * Determina la primera cifra de un número entero introducido por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

import java.lang.Math;

public class PrimeraCifra {
	public static void main(String[] args) {
		System.out.print("Introduzca un número entero: ");
		String snumero = System.console().readLine();
		int tamano = snumero.length();
		int numero = Integer.parseInt(snumero);
		// int multiplo = Double.valueOf(Math.pow(10, tamano - 1)).intValue();
		Double dmultiplo = Math.pow(10, tamano - 1);
		int multiplo = dmultiplo.intValue();
		int primeraCifra = numero / multiplo;
		System.out.println("La primera cifra es " + primeraCifra);
	}
}
