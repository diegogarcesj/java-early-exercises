/**
 * Muestra los múltiplos de 5 de 0 a 100 usando el bucle do-while.
 * 
 * @author Diego Garcés Jiménez
 */

public class Multiplos5De0A100DoWhile {
	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			if(i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 100);
	}
}
