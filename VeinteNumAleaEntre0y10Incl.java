/**
 * Muestra 20 números aleatorios entre 0 y 10, ambos incluidos, separados por espacio.
 * 
 * @author Diego Garcés Jiménez
 */
public class VeinteNumAleaEntre0y10Incl {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(((int)(Math.random()*11)) + " ");
        }
        System.out.println();
    }
}