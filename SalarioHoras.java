/**
 * Calcula el salario semanal en base a las horas trabajadas.
 * 
 * @author Diego Garcés
 */

import java.util.Scanner;

public class SalarioHoras {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca las horas semanales trabajadas: ");
		int horas = s.nextInt();
		
		int salario = horas * 12;
		
		System.out.println("El salario semanal es de " + salario + " euros.");
	}
}
