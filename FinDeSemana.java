/**
 * Dado un día de la semana y una hora, calcula cuántos minutos faltan para el fin de semana.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;

public class FinDeSemana {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un día de la semana (lunes-viernes) y una hora (13 45) separados por espacios: ");
		String dia = s.next();
		int hora = s.nextInt();
		int minuto = s.nextInt();
		
		int falta = 0;
		
		if (dia.equals("lunes")) {
			falta = 24 * 60 * 3 + (23 - hora)*60 + (60 - minuto) + (15 * 60);
			// 3 dias + minutos para medianoche + minutos para la hora + minutos para las 15:00 del viernes
		} else if (dia.equals("martes")) {
			falta = 24 * 60 * 2 + (23 - hora)*60 + (60 - minuto) + (15 * 60);
		} else if (dia.equals("miercoles") || dia.equals("miércoles")) {
			falta = 24 * 60 * 1 + (23 - hora)*60 + (60 - minuto) + (15 * 60);
		} else if (dia.equals("jueves")) {
			falta = (23 - hora)*60 + (60 - minuto) + (15 * 60);
		} else if (dia.equals("viernes")) {
			falta = (14 - hora)*60 + (60 - minuto); // minutos para las 15:00 + minutos para la hora.
		} else {
			System.out.println("Día inválido.");
		}
		
		if (falta == 0) {
		} else {
			System.out.println("Faltan " + falta + " minutos para el fin de semana el viernes a las 15:00.");
		}
	}
}
