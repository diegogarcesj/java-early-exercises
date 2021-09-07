/**
 * Calcula el volumen de un cono.
 * 
 * @author Diego Garcés
 */

import java.util.Scanner;

public class VolumenCono {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double pi = 3.1415926535;
		
		System.out.print("Introduzca el radio de la base del cono: ");
		double r = s.nextDouble();
		System.out.print("Introduzca la altura del cono: ");
		double h = s.nextDouble();
		
		double v = ( pi * r * r * h ) / 3;
		
		System.out.println("El volumen del cono es " + v);
	}
}
