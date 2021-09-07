/**
 * Conversor de Mb a Kb.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;

public class ConversorMbKb {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca cantidad de Mb: ");
		double mb = s.nextDouble();
		
		double kb = 1024 * mb;
		
		System.out.println(mb + " Mb es igual a " + kb + " Kb.");
	}
} 
