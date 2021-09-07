/**
 * Pinta una pirámide con un carácter introducido por teclado, seleccionando con un menú la dirección de la punta.
 * 
 * @author Diego Garcés Jiménez
 */

public class PiramideCarDir {
	public static void main(String[] args) {
		System.out.print("Introduzca un carácter para dibujar la pirámide: ");
		String c = System.console().readLine();
		
		System.out.println("Dirección del vértice de la pirámide:");
		System.out.println("1. Arriba");
		System.out.println("2. Abajo");
		System.out.println("3. Izquierda");
		System.out.println("4. Derecha");
		System.out.print("\nElija una opción (1-4): ");
		int d = Integer.parseInt(System.console().readLine());
		
		switch (d) {
			case 1:
				System.out.println("  " + c + "  ");
				System.out.println(" " + c + c + c + " ");
				System.out.println(c + c + c + c + c);
				break;
			case 2:
				System.out.println(c + c + c + c + c);
				System.out.println(" " + c + c + c + " ");
				System.out.println("  " + c + "  ");
				break;
			case 3:
				System.out.println("  " + c);
				System.out.println(" " + c + c);
				System.out.println(c + c + c);
				System.out.println(" " + c + c);
				System.out.println("  " + c);
				break;
			case 4:
				System.out.println(c + "  ");
				System.out.println(c + c + " ");
				System.out.println(c + c + c );
				System.out.println(c + c + " ");
				System.out.println(c + "  ");
				break;
			default:
				System.out.println("Opción no válida.");
			}
	}
}
