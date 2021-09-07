/**
 * Ordena del menor al mayor tres números introducidos por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;

public class OrdenaTresNumeros {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca tres números separados por espacios: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int menor = 0;
		int medio = 0;
		int mayor = 0;
		
		if ((a <= b) && (b <= c)) {
			menor = a;
			medio = b;
			mayor = c;
		} else if ((a <= c) && (c <= b)) {
			menor = a;
			medio = c;
			mayor = b;
		} else if ((b <= a) && (a <= c)) {
			menor = b;
			medio = a;
			mayor = c;
		} else if ((b <= c) && (c <= a)) {
			menor = b;
			medio = c;
			mayor = a;
		} else if ((c <= a) && (a <= b)) {
			menor = c;
			medio = a;
			mayor = b;
		} else if ((c <= b) && (b <= a)) {
			menor = c;
			medio = b;
			mayor = a;
		}
		
		System.out.println("Números ordenados: " + menor + " " + medio + " " + mayor);
	}
} 
