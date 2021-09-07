/**
 * Muestra el cuadrado y el cubo de los cinco primeros números a partir de uno introducido por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class CuadradoCubo {
	public static void main(String[] args) {
		
		System.out.print("Introduzca un número: ");
		int n = Integer.parseInt(System.console().readLine());
		
		for (int i = n; i <= (n + 4); i++) {
			System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
		}
	}
}
