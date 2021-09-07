/**
 * Lee 10 números por teclado y los muestra en orden inverso.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio03 {
    public static void main(String[] args) {
        int[] num = new int[10];
        System.out.println("Introduzca 10 números:");
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Los números en orden inverso: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}