/**
 * Calcula los segundos que faltan para llegar a medianoche.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;

public class HoraMedianoche {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca hora y minutos separados por un espacio en formato de 24 horas: ");
		int hora = s.nextInt();
		int min = s.nextInt();
		
		int seg = (23 - hora)*3600 + (60 - min)*60;
		
		System.out.println("Faltan " + seg + " segundos para medianoche.");
	}
}
