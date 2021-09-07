/**
 * Suma los 100 números siguientes a un entero positivo introducido por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class SumaCienSiguientes {
	public static void main(String[] args) {
		System.out.print("Introduzca un número entero positivo: ");
		int n = Integer.parseInt(System.console().readLine());
		
		int suma = 0;
		if ( n >= 0 ) { // Incluimos el 0 a pesar de la definición
			for (int i = n + 1; i <= n + 100; i++) {
				suma += i;
			}
		} else {
			System.out.println("El número introducido no es un entero positivo.");
		}
		if (suma > 0) {
			System.out.println("La suma de los cien números siguientes es: " + suma);
		}
	}
}
