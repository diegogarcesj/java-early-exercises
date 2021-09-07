/**
 * Obtiene los números entre dos enteros introducidos por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;

public class DeSieteEnSiete {
	public static void main(String[] args) {
		
		int min, max;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca dos números enteros distintos separados por espacio: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a != b) {
			if (a < b) {
				min = a;
				max = b;
			} else {
				min = b;
				max = a;
			}
			for (int i = min; i <= max; i += 7){
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Los números son iguales");
		}
	}
}
