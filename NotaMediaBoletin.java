/**
 * Calcula la media de tres notas y dice la nota del boletín.
 * 
 * @author Diego Garcés Jiménez
 */

public class NotaMediaBoletin {
	public static void main(String[] args) {
		System.out.print("Introduzca la primera nota: ");
		double a = Double.parseDouble(System.console().readLine());
		System.out.print("Introduzca la segunda nota: ");
		double b = Double.parseDouble(System.console().readLine());
		System.out.print("Introduzca la tercera nota: ");
		double c = Double.parseDouble(System.console().readLine());
		
		double media = ( a + b + c ) / 3;
		
		String boletin;
		
		if ( media < 4 ) {
			boletin = "Insuficiente";
		}
		else if ( (media >= 4) && (media < 5) ) {
			boletin = "Suficiente";
		}
		else if ( (media >= 5) && (media < 6) ) {
			boletin = "Bien";
		}
		else if ( (media >= 6) && (media < 6.5) ) {
			boletin = "Notable";
		}
		else if ( (media >= 6.5) && (media <= 7) ) {
			boletin = "Sobresaliente";
		} else {
			boletin = "No válido";
		}
		
		System.out.println("Media: " + media + "\tBoletín: " + boletin);
		
	}
}
