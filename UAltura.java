/**
 * Pinta una letra U con la altura introducida por teclado.
 * 
 * @author Diego Garcés Jiménez
 */
public class UAltura {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la U: ");
        int h = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= h - 1; i++) {
            System.out.print("* ");
            for (int j = 1; j <= h - 2; j++) {
                System.out.print("  ");
            }
            System.out.print("*\n");
        }
        System.out.print("  ");
        for (int k = 1; k <= h - 2; k++) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}