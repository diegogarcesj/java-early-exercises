/**
 * Test de infidelidad; lee las preguntas desde un archivo de texto.
 * 
 * @author Diego Garcés Jiménez
 */

import java.io.File;
import java.util.Scanner;

public class TestInfidelidad {
	public static void main(String[] args){
				
		int puntaje = 0 ;
		int numeroPreguntas = 0;
		
		System.out.println("Responda a las preguntas con V o F:");
		
		try {
			Scanner in = new Scanner(new File("test_infidelidad.txt"));
			
			while (in.hasNextLine()) {
				numeroPreguntas++;
				String pregunta = in.nextLine();
				System.out.print(pregunta + " [V/F]: ");
				String respuesta = System.console().readLine();
				if (respuesta.equals("V") || respuesta.equals("v")) {
					puntaje = puntaje + 3;
				}
			}
			in.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Has obtenido " + puntaje + " de " + (numeroPreguntas * 3) + " puntos. Saca tus conclusiones.");
	}
}
				
