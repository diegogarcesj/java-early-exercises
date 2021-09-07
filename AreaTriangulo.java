/**
 * Calcula el area de un triangulo
 * 
 * @author Diego Garcés
 */

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la base del triángulo: ");
		int b = s.nextInt();
		System.out.print("Introduzca la altura del triángulo: ");
		int h = s.nextInt();
		
		double area = ((double)b * (double)h) / 2;
		
		System.out.println("El área del triángulo es " + area);
	}
}
