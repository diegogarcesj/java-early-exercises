/**
 * Muestra una L de altura introducida por teclado.
 * 
 * @author Diego Garcés Jiménez
 */
public class LAltura {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la L: ");
        int h = Integer.parseInt(System.console().readLine());

        for (int i = 1; i < h; i++) {
            System.out.println("*");
        }
        for (int j = 1; j <= (h / 2 + 1); j++) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}