/**
 * Calcula el total de una factura a partir de la base imponible.
 * 
 * @author Diego Garcés
 */

public class Factura {
	public static void main(String[] args) {
		int base = 1000;
		double iva = base * 0.19;
		double total = base + iva;
		
		System.out.println("El total de la factura es " + total);
	}
}
