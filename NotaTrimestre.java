/**
 * Calcula la nota del trimestre. Si es menor que 5, pregunta por el resultado del examen de recuperación.
 * 
 * @author Diego Garcés Jiménez
 */

public class NotaTrimestre {
	public static void main(String[] args) {
		System.out.print("Nota del primer control: ");
		double primer = Double.parseDouble(System.console().readLine());
		System.out.print("Nota del segundo control: ");
		double segundo = Double.parseDouble(System.console().readLine());
		
		double promedio = (primer + segundo) / 2;
		
		if (promedio >= 5) {
			System.out.println("Tu nota de Programación es " + promedio);
		} else {
			System.out.print("Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
			String recuperacion = System.console().readLine();
			if (recuperacion.equals("apto")) {
				System.out.println("Tu nota de Programación es 5");
			} else if (recuperacion.equals("no apto")) {
				System.out.println("Tu nota de Programación es " + promedio);
			}
		}
	}
}
