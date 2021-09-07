/**
 * Pide 8 números enteros y luego muestra los números junto a par o impar según corresponda.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio09 {
    public static void main(String[] args) {
        int[] numero = new int[8];
        System.out.println("Introduzca 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Los números son: ");
        for (int i = 0; i < 8; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i] + " par");
            } else {
                System.out.println(numero[i] + " impar");
            }
        }
    }
}