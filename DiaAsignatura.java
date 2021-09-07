/**
 * Pide por teclado un día de la semana y muestra la asignatura de la mañana.
 * 
 * @author Diego Garcés Jiménez
 */

public class DiaAsignatura {
	public static void main(String[] args) {
		
		System.out.print("Introduzca un día de la semana: ");
		String dia = System.console().readLine();
		
		switch (dia) {
			case "lunes":
				System.out.println("Fundamentos de la Programación");
				break;
			case "martes":
				System.out.println("Introducción a las TI");
				break;
			case "miercoles":
				System.out.println("IT Essentials");
				break;
			case "jueves":
				System.out.println("Autogestión");
				break;
			case "viernes":
				System.out.println("Comunicación Efectiva");
				break;
			case "sabado":
				System.out.println("Matemática");
				break;
			case "domingo":
				System.out.println("Trabajo");
				break;
			default:
				System.out.println("Introduzca un día válido.");
		}
	}
}
