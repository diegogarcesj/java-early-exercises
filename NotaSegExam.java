/**
 * Calcula la nota del segundo examen para la media deseada.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;

public class NotaSegExam {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la nota del primer examen: ");
		double x = s.nextDouble();
		
		System.out.print("¿Qué nota quieres sacar en el trimestre? ");
		double z = s.nextDouble();
		
		double y = ( z - 0.4 * x) / 0.6;
		
		System.out.println("Para tener un " + z + " en el trimestre necesitas sacar un " + y + " en el segundo examen.");
	}
}
