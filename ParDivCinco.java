/**
 * Determina si un número es par y/o divisible por 5.
 * 
 * @author Diego Garcés Jiménez
 */

public class ParDivCinco {
	public static void main(String[] args) {
		System.out.print("Introduzca un número: ");
		int x = Integer.parseInt(System.console().readLine());
		
		if ( x % 2 == 0 ) {
			System.out.println(x + " es par.");
		} else {
			System.out.println(x + " es impar.");
		}
		
		if ( x % 5 == 0 ) {
			System.out.println(x + " es divisible por 5.");
		} else {
			System.out.println(x + " no es divisible por 5.");
		}
	}
}
