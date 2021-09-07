/**
 * Calcula el tiempo que tarda en caer un objeto desde una altura.
 * 
 * @author Diego Garcés Jiménez
 */

import java.lang.Math;

public class CaidaLibre {
	public static void main(String[] args) {
		System.out.print("Introduzca la altura en metros desde la que cae el objeto: ");
		double h = Double.parseDouble(System.console().readLine());
		
		double g = 9.81;
		
		double t = Math.sqrt( (2 * h) / g );
		
		System.out.println("El objeto tarda en caer " + t + " segundos.");
	}
}
