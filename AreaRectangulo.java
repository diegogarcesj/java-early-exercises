/**
 * Calcula el área de un rectángulo a partir de dos entradas.
 * 
 * @author Diego Garcés
 */

import java.util.Scanner;

public class AreaRectangulo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el largo del rectángulo: ");
		int b = s.nextInt();
		System.out.print("Introduzca la altura del rectángulo: ");
		int h = s.nextInt();
		
		int area = b * h;
		
		System.out.println("El área del rectángulo es " + area);
	}
}
