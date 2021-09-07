/**
 * Lee una lista de 10 números y determina cuántos son positivos y cuántos son negativos.
 * 
 * @author Diego Garcés Jiménez
 */

public class ListaCuantosPositivosNegativos {
	public static void main(String[] args) {
		int positivos = 0;
		int negativos = 0;
		
		System.out.println("Introduzca diez números positivos o negativos:");
		
		for (int i = 1; i <= 10; i++) {
			double numero = Double.parseDouble(System.console().readLine());
			if (numero >= 0) {
				positivos++;
			} else {
				negativos++;
			}
		}
		
		System.out.println("Positivos: " + positivos + "\tNegativos: " + negativos);
	}
}
