/**
 * Conversor de Kb a Mb.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;

public class ConversorKbMb {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de Kb: ");
		double kb = s.nextDouble();
		
		double mb = kb / 1024;
		
		System.out.println(kb + " Kb es igual a " + mb + " Mb.");
	}
}
