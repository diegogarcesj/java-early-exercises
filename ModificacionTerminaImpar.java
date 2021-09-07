/**
 * Modificacion de Termina Cuando Es Impar, agregándole la pregunta si quiere continuar.
 * 
 * @author Diego Garcés Jiménez
 */

public class ModificacionTerminaImpar {
	public static void main(String[] args) {
		
		int numero;
		String aux;
		
		do {
			System.out.print("Dime un número: ");
			numero = Integer.parseInt(System.console().readLine());
			System.out.print("¿Quiere continuar? (s/n): ");
			aux = System.console().readLine();
			
			if (numero % 2 == 0) {  // comprueba si el número introducido es par
				System.out.println("Qué bonito es el " + numero);
			} else {
				System.out.println("No me gustan los números impares, adiós.");
				aux = "n";
			}
			
		} while ( aux.equals("s") || aux.equals("S") );
	}
}

