/**
 * Lee 15 números del teclado. Rota el array: el elemento de 0 pasa al 1, el 1 al 2, y así. Lo muestra.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio06 {
    public static void main(String[] args) {
        int[] num = new int[15];
        int aux;
        // Lee 15 números por teclado
        System.out.println("Introduzca 15 números:");
        for (int i = 0; i < 15; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }
        // Rota el array
        aux = num[14];
        for (int i = 14; i > 0; i--) {
            num[i] = num [i - 1];
        }
        num[0] = aux;
        // Muestra el array
        System.out.println("El array rotado es:");
        for (int n : num) { // estilo foreach
            System.out.print(n + " ");
        }
        System.out.println();
    }
}