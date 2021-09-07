/**
 * Muestra los números del 320 al 160 contando hacia atrás de 20 en 20 usando un bucle while.
 * 
 * @author Diego Garcés Jiménez
 */

public class De320A160De20En20While {
	public static void main(String[] args) {
		
		int i = 320;
		
		while (i >= 160) {
			System.out.println(i);
			i -= 20;
		}
	}
}
