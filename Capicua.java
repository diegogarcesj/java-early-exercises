/**
 * Determina si un número es capicúa.
 * 
 * @author Diego Garcés Jiménez
 */

public class Capicua {
	public static void main(String[] args) {
		System.out.print("Introduzca un número entero positivo: ");
		int numero = Integer.parseInt(System.console().readLine());
		int auxiliar = numero;
		int digito;
		int invertido = 0;
		
		while(auxiliar != 0){
			digito = auxiliar % 10;
			auxiliar = auxiliar / 10;
			invertido = invertido * 10 + digito;
		}
		
		if (numero == invertido) {
			System.out.println("El número es capicúa.");
		} else {
			System.out.println("El número no es capicúa.");
		}
	}
}
