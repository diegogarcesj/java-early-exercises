/**
 * Resuelve una ecuación de segundo grado.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;
import java.lang.Math;

public class EcuacionSegundoGrado {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Sea una ecuación de segundo grado ax² + bx + c = 0");
		System.out.print("Introduzca el término a: ");
		double a = s.nextDouble();
		System.out.print("Introduzca el término b: ");
		double b = s.nextDouble();
		System.out.print("Introduzca el término c: ");
		double c = s.nextDouble();
		
		double discr = b*b - 4*a*c;
		
		if (discr < 0) {
			System.out.println("No existe solución en los reales.");
		} else {
			double x1 = (-b + Math.sqrt(discr)) / 2*a;
			double x2 = (-b - Math.sqrt(discr)) / 2*a;
			System.out.println("Solución: x1 = " + x1 + " x2 = " + x2);
		}
	}
}
