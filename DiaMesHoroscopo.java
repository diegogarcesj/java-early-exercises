/**
 * Dice el signo del horóscopo a partir del día y mes de nacimiento.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;

public class DiaMesHoroscopo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el día y mes de nacimiento separado por un espacio: ");
		int dia = s.nextInt();
		String mes = s.next();
		
		String signo;
		
		if ( (dia >= 1) && (dia <= 31) ) {
			if (mes.equals("enero")) {
				if (dia <= 20) {
					signo = "Capricornio";
				} else {
					signo = "Acuario";
				}
			} else if (mes.equals("febrero")) {
				if (dia <= 19) {
					signo = "Acuario";
				} else {
					signo = "Piscis";
				}
			} else if (mes.equals("marzo")) {
				if (dia <= 20) {
					signo = "Piscis";
				} else {
					signo = "Aries";
				}
			} else if (mes.equals("abril")) {
				if (dia <= 20) {
					signo = "Aries";
				} else {
					signo = "Tauro";
				}
			} else if (mes.equals("mayo")) {
				if (dia <= 21) {
					signo = "Tauro";
				} else {
					signo = "Géminis";
				}
			} else if (mes.equals("junio")) {
				if (dia <= 21) {
					signo = "Géminis";
				} else {
					signo = "Cáncer";
				}
			} else if (mes.equals("julio")) {
				if (dia <= 23) {
					signo = "Cáncer";
				} else {
					signo = "Leo";
				}
			} else if (mes.equals("agosto")) {
				if (dia <= 23) {
					signo = "Leo";
				} else {
					signo = "Virgo";
				}
			} else if (mes.equals("septiembre")) {
				if (dia <= 23) {
					signo = "Virgo";
				} else {
					signo = "Libra";
				}
			} else if (mes.equals("octubre")) {
				if (dia <= 23) {
					signo = "Libra";
				} else {
					signo = "Escorpión";
				}
			} else if (mes.equals("noviembre")) {
				if (dia <= 22) {
					signo = "Escorpión";
				} else {
					signo = "Sagitario";
				}
			} else if (mes.equals("diciembre")) {
				if (dia <= 21) {
					signo = "Sagitario";
				} else {
					signo = "Capricornio";
				}
			} else {
				signo = "Mes no válido";
			}
		} else {
			signo = "Día no válido";
		}
		
		System.out.println("Signo del horóscopo: " + signo);
	}
}
