/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class TablaMultiplicar {
	public static void main(String[] args) {
		System.out.print("Introduzca un número entero: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		for ( int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
	}
}
