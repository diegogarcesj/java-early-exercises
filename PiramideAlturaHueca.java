/**
 * Dibuja una pirámide hueca con altura y caracter introducido por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class PiramideAlturaHueca {
	public static void main(String[] args) {
		System.out.print("Introduzca la altura de la pirámide: ");
		int n = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca un caracter para dibujar la pirámide: ");
		String c = System.console().readLine();
		
		for (int i = 1; i <= (n - 1); i++) { // Primera línea
			System.out.print(" ");
		}
		System.out.print(c);
		System.out.print("\n");
		
		for (int j = 2; j <= (n - 1); j++) { // De la segunda a la penúltima línea
			for (int k = 1; k <= (n - j); k++) {
				System.out.print(" ");
			}
			System.out.print(c);
			for (int l = 1; l <= (2 * j - 3); l++) {
				System.out.print(" ");
			}
			System.out.print(c);
			System.out.print("\n");
		}
		
		for (int m = 1; m <= (2 * n - 1); m++) { // Última línea
			System.out.print(c);
		}
		System.out.print("\n");
	}
}
