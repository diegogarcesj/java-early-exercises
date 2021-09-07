/**
 * Genera 20 números aleatorios entre 0 y 100. Ordena los pares primero y los impares después.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio10 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int j = -1;
        int k = -1;
        // genera los números aleatorios en el array
        for (int i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random()*101);
        }
        // muestra el array generado
        System.out.println("El array aleatorio:");
        for (int n : numero) { // for al estilo foreach
            System.out.print(n + " ");
        }
        System.out.println();
        // separa los pares en el array par y los impares en el array impar
        for (int i = 0; i < 20; i++) {
            if (numero[i] % 2 == 0) {
                j++;
                par[j] = numero[i];
            } else {
                k++;
                impar[k] = numero[i];
            }
        }
        // ordena los pares primero y los impares después
        for (int i = 0; i <= j; i++) {
            numero[i] = par[i];
        }
        int i = j + 1;
        k = 0;
        while (i < 20) {
            numero[i] = impar[k];
            i++;
            k++;
        }
        // muestra el array ordenado pares e impares
        System.out.println("El array ordenado pares-impares:");
        for (int n : numero) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}