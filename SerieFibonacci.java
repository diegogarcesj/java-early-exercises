/**
 * Muestra los n primeros números de la serie de Fibonacci.
 * 
 * @author Diego Garcés Jiménez
 */

public class SerieFibonacci {
	public static void main(String[] args) {
		
		System.out.print("Introduzca un número entero positivo: ");
		int n = Integer.parseInt(System.console().readLine());
		
		int a = 0;
		int b = 1;
		int c;
				
		if (n == 1) {
			System.out.print(a);
		} else if (n == 2) {
			System.out.print(a + " " + b);
		} else if (n >= 3) {
			System.out.print(a + " " + b + " ");		
			for (int i = 3; i <= n; i++) {
				c = a + b; // El siguiente es la suma del anterior al anterior a y del anterior b
				System.out.print(c + " ");
				a = b; // El anterior b pasa a ser el anterior al anterior a
				b = c; // El siguiente c pasa a ser el anterior b
			}
		} else {
			System.out.println("Número no válido");
		}
	}
}
