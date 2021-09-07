/**
 * Pide 10 números por teclado y luego los muestra seguido de máximo o mínimo.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio05 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int min = 100000;
        int max = 0;
        System.out.println("Introduzca diez números enteros:");
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Los números y el mínimo y máximo son:");
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i]);
            if (num[i] == min){
                System.out.print(" mínimo");
            }
            if (num[i] == max){
                System.out.print(" máximo");
            }
            System.out.println();
        }
    }
}