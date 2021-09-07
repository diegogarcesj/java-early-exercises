/**
 * Pide 10 números y los guarda en un array, muestra el array, ordena los primos primeros y los no primos después.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio11 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int[] primo = new int[10];
        int[] noPrimo = new int[10];
        boolean esPrimo = true;
        int l = -1;
        int m = -1;
        // pide los 10 números
        System.out.println("Introduzca 10 números: ");
        for (int i = 0; i < 10; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
        }
        // muestra el array inicial
        System.out.println("El array inicial es: ");
        for (int n: numero) {   // for al estilo foreach
            System.out.print(n + " ");
        }
        System.out.println();
        // separa primos y no primos en dos arrays
        for (int i = 0; i < 10; i++) {
            for (int j = 2; j <= (numero[i] - 1); j++) {
                if (numero[i] % j == 0) {   // si tiene divisores, no es primo
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                l++;
                primo[l] = numero[i];
            } else {
                m++;
                noPrimo[m] = numero[i];
            }
            esPrimo = true; // reiniciamos variable
        }
        // ordena los primos primero en el array final
        for (int i = 0; i <= l; i++) {
            numero[i] = primo[i];
        }
        // ordena los no primos después en el array final
        int i = l + 1;
        m = 0;
        while (i < 10) {
            numero[i] = noPrimo[m];
            i++;
            m++;
        }
        // muestra el array final
        System.out.println("El array final es: ");
        for (int n : numero) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}