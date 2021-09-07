/**
 * Calcula el total de la factura a partir de la base imponible ingresada por teclado.
 * 
 * @author Diego Garcés
 */

import java.util.Scanner;

public class FacturaTeclado {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la base imponible: ");
		int base = s.nextInt();
		
		double iva = (double)base * 0.19;
		double total = (double)base + iva;
		
		System.out.println("El total de la factura es " + total);
	}
}
