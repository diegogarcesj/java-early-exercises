/**
 * Conversor de Euros a Pesos, con entrada de Euros por teclado.
 * 
 * @author Diego Garcés
 */

import java.util.Scanner;

public class EuroPesoTeclado {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de euros: ");
		int euro = s.nextInt();
		
		int peso = euro * 907;
		
		System.out.println("La cantidad es igual a " + peso + " pesos.");
	}
}
