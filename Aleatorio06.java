/**
 * Generación de números aleatorios.
 * 
 * @author Diego Garcés Jiménez
 */
public class Aleatorio06 {
    public static void main(String[] args) {

        System.out.println("Genera al azar piedra, papel o tijera:");

        int mano = (int)(Math.random() * 3); // Genera un número al azar entre 0 y 2 ambos incluidos

        switch (mano) {
            case 0:
                System.out.println("piedra");
                break;
            case 1:
                System.out.println("papel");
                break;
            case 2:
                System.out.println("tijera");
        }
    }
}