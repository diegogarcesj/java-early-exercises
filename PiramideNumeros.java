/**
 * Pide un número n y muestra una pirámide de números de n filas.
 * 
 * @author Diego Garcés Jiménez
 */

public class PiramideNumeros {
    public static void main(String[] args) {
        System.out.print("Introduzca el número de filas de la pirámide de números: ");
        int n = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.print("\n");
        }
    }
}