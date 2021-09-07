/**
 * Dado un número del 1 al 7, muestra el nombre del día de la semana.
 * 
 * @author Diego Garcés Jiménez
 */

public class NumeroDia {
	public static void main(String[] args) {
		System.out.print("Introduzca un número del 1 al 7: ");
		int n = Integer.parseInt(System.console().readLine());
		
		String dia;
		
		switch (n) {
			case 1:
				dia = "Lunes";
				break;
			case 2:
				dia = "Martes";
				break;
			case 3:
				dia = "Miércoles";
				break;
			case 4:
				dia = "Jueves";
				break;
			case 5:
				dia = "Viernes";
				break;
			case 6:
				dia = "Sábado";
				break;
			case 7:
				dia = "Domingo";
				break;
			default:
				dia = "No válido";
				break;
		}
		
		System.out.println(dia);
	}
}
