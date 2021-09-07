/**
 * Determina la última cifra de un número entero.
 * 
 * @author Diego Garcés Jiménez
 */

public class UltimaCifra {
	public static void main(String[] args) {
		System.out.print("Introduzca un número entero: ");
		int n = Integer.parseInt(System.console().readLine());
		
		int ultCifra = n % 10;
		
		System.out.println("Última cifra: " + ultCifra);
	}
}
