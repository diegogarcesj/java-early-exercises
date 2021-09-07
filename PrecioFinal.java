/**
 * Calcula el precio final según base imponible, tipo de IVA aplicado y código promocional. Con condicional if.
 * 
 * @author Diego Garcés Jiménez
 */

import java.util.Scanner;

public class PrecioFinal {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la base imponible: ");
		double base = s.nextDouble();
		
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		String tipoIva = System.console().readLine();
		
		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		String codPromo = System.console().readLine();
		
		double iva = 0;
		String descIva = "";
		
		if (tipoIva.equals("general")) {
			iva = base * 0.21;
			descIva = "21%";
		}
		if (tipoIva.equals("reducido")) {
			iva = base * 0.1;
			descIva = "10%";
		}
		if (tipoIva.equals("superreducido")) {
			iva = base * 0.04;
			descIva = "4%";
		}
		
		double precioConIva = base + iva;
		
		double descto = 0;
		if (codPromo.equals("nopro")) {
			descto = 0;
		}
		if (codPromo.equals("mitad")) {
			descto = precioConIva / 2;
		}
		if (codPromo.equals("meno5")) {
			descto = 5;
		}
		if (codPromo.equals("5porc")) {
			descto = precioConIva * 0.05;
		}
		
		double total = precioConIva - descto;
		
		System.out.println("Base imponible \t\t" + base);
		System.out.println("IVA (" + descIva + ")  \t\t " + iva);
		System.out.println("Precio con IVA \t\t" + precioConIva);
		System.out.println("Cód. promo. (" + codPromo + "):\t-" + descto);
		System.out.println("TOTAL \t\t\t" + total);
	}
}
