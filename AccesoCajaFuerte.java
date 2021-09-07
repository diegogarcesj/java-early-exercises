/**
 * Pide el acceso a una caja fuerte por cuatro oportunidades.
 * 
 * @author Diego Garcés Jiménez
 */

public class AccesoCajaFuerte {
	public static void main(String[] args) {
		
		int i;
		int combi = 6667;
		int intro;
		
		for (i = 1; i <= 4; i++) {
			System.out.print("Introduzca la combinación de la caja fuerte: ");
			intro = Integer.parseInt(System.console().readLine());
			
			if (intro == combi) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
				i = 5; // Sale del bucle for
			} else {
				System.out.println("Lo siento, esa no es la combinación.");
			}
		}
	}
}
