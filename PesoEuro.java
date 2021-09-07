/**
 * Conversor de pesos a euros.
 * 
 * @author Diego Garcés
 */

public class PesoEuro {
	public static void main(String[] args) {
		int peso = 100;
		double euro = (double)peso / 907;
		
		System.out.println(peso + " pesos son " + euro + " euros");
	}
}
