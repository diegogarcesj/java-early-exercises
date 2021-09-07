/**
 * Resuelve una ecuación de primer grado de la forma: ax + b = 0.
 * 
 * @author Diego Garcés Jiménez
 */

public class EcuacionPrimerGrado {
	public static void main(String[] args) {
		System.out.println("Sea una ecuación de primer grado de la forma ax + b = 0.");
		System.out.print("Introduzca el término a: ");
		double a = Double.parseDouble(System.console().readLine());
		System.out.print("Introduzca el término b: ");
		double b = Double.parseDouble(System.console().readLine());
		
		double x = - ( b / a );
		
		System.out.println("La solución es x = " + x);
	}
}
