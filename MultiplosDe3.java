/**
 * Muestra, cuenta y suma los múltiplos de 3 del 1 hasta un numero introducido por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class MultiplosDe3 {
	public static void main(String[] args) {
		
		int contador = 0;
		int suma = 0;
		int multiplo = 1;
		
		System.out.print("Introduzca un número: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		System.out.print("Múltiplos de 3: ");
		
		int i = 1;
		while (i * 3 <= numero) {
			multiplo = i * 3;
			i++;
			System.out.print(multiplo + " "); 
			contador++;
			suma += multiplo; // Equivale a suma = suma + multiplo
		}
		System.out.print("\n");
		System.out.println("La cantidad es " + contador);
		System.out.println("La suma es " + suma);
	}
}
