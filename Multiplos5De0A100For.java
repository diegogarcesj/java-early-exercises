/**
 * Muestra los múltiplos de 5 de 0 a 100 usando un bucle for.
 * 
 * @author Diego Garcés Jiménez
 */

public class Multiplos5De0A100For {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}
