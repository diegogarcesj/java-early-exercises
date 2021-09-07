/**
 * Calcula el salario considerando las horas extras.
 * 
 * @author Diego Garcés Jiménez
 */

public class SalarioExtras {
	public static void main(String[] args) {
		System.out.print("Introduzca el número de horas trabajadas: ");
		int horas = Integer.parseInt(System.console().readLine());
		
		int salario = 0;
		
		if (horas <= 40) {
			salario = horas * 12;
		}
		else if (horas > 40) {
			salario = 40 * 12 + (horas - 40) * 16;
		}
		
		System.out.println("El salario semanal por " + horas + " horas es " + salario + " euros.");
	}
}
