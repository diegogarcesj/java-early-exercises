/**
 * Suma, resta, multiplica y divide dos números ingresados por teclado.
 * 
 * @author Diego Garcés
 */

import java.util.Scanner;

public class SumResMulDivTecl {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca dos números (pueden contener decimales) separados por espacios: ");
		double x = s.nextDouble();
		double y = s.nextDouble();
		
		double sum = x + y;
		double res = x - y;
		double mul = x * y;
		double div = x / y;
		
		System.out.println("La suma es " + sum + " y la resta es " + res);
		System.out.println("La multiplicación es " + mul + " y la división es " + div);
	}
}
