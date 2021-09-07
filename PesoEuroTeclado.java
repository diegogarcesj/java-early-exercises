/**
 * Conversor de pesos a euros, con entrada de pesos por teclado.
 * 
 * @author Diego Garcés
 */

import java.util.Scanner;

public class PesoEuroTeclado {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de pesos: ");
		int peso = s.nextInt();
		
		double euro = (double)peso / 907;
		
		System.out.println("La cantidad es igual a " + euro + " euros.");
	}
}
