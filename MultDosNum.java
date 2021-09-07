/**
 * Pide dos números y los multiplica
 * 
 * @author Diego Garcés
 */

import java.util.Scanner;

public class MultDosNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce dos números (pueden contener decimales) separados por espacio: ");
		double x = s.nextDouble();
		double y = s.nextDouble();
		
		double mul = x * y;
		
		System.out.println("La multiplicación de ambos números es " + mul);
	}
}
