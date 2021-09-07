/**
 * Pide una hora por teclado y saluda según la hora ingresada.
 * 
 * @author Diego Garcés Jiménez
 */

public class HoraSaludo {
	public static void main(String[] args) {
		
		System.out.print("Introduzca una hora (sin minutos): ");
		int hora = Integer.parseInt(System.console().readLine());
		
		if ( (hora >= 6) && (hora <= 12 ) ) {
			System.out.println("Buenos días");
		}
		else if ( (hora >= 13) && (hora <= 20) ) {
			System.out.println("Buenas tardes");
		}
		else if ( ((hora >= 21) && (hora <= 24)) || ((hora >= 1) && (hora <= 5)) ) {
			System.out.println("Buenas noches");
		}
		else {
			System.out.println("Hora no válida");
		}
	}
}
