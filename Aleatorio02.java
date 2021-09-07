/**
 * Generación de números aleatorios.
 * 
 * @author Diego Garcés Jiménez
 */
public class Aleatorio02 {
    public static void main(String[] args) {
        System.out.println("20 números aleatorio entre 0 y 10");
        System.out.println(" sin llegar a 10 (con decimales):");

        for (int i = 1; i <= 20; i++) {
            System.out.println( Math.random() * 10 + "  ");
        }
    }
}