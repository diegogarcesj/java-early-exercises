/**
 * Muestra los números del 320 al 160, hacia atrás, de 20 en 20, usando bucle do-while.
 * 
 * @author Diego Garcés Jiménez
 */

public class De320A160De20En20DoWhile {
	public static void main(String[] args) {
		
		int i = 320;
		
		do {
			System.out.println(i);
			i -= 20;
		} while (i >= 160);
	}
}
