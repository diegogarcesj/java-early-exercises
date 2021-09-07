/**
 * Muestra una pirámide por pantalla; la altura y el caracter son introducidos por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class PiramideAltura {
	public static void main(String[] args) {
		System.out.print("Introduzca la altura de la pirámide: ");
		int n = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca un caracter para dibujar la pirámide: ");
		String c = System.console().readLine();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print(c);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
