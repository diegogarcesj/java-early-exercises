/**
 * Muestra 50 números aleatorios entre 100 y 199, ambos incluidos.
 * Muestra el máximo, el mínimo y la media.
 * 
 * @author Diego Garcés Jiménez
 */
public class CincuentaAlea100y199InclMaxMinMed {
    public static void main(String[] args) {
        int max = 0;
        int min = 200;
        int suma = 0;

        for (int i = 1; i <= 50; i++) {
            int num = (int)(Math.random()*100) + 100; // Número aleatorio entre 100 y 199, ambos incluidos.
            System.out.print(num + " ");
            suma += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        double media = (double)suma / 50;
        System.out.println();
        System.out.println("El máximo: " + max);
        System.out.println("El mínimo: " + min);
        System.out.println("La media: " + media);

    }
}