/**
 * Genera 100 números aleatorios del 0 al 20, los muestra, 
 * pide dos números, reemplaza el primero por el segundo en el array. Lo muestra.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio07 {
    public static void main(String[] args) {

        int[] numero = new int[100];

        for (int i = 0; i < 100; i++) {
            numero[i] = (int)(Math.random()*21);
            System.out.print(numero[i] + " ");
        }
        System.out.println();
        
        System.out.print("Introduzca un número para reemplazar: ");
        int primero = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca un número reemplazante: ");
        int segundo = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < 100; i++) {
            if (numero[i] == primero) {
                System.out.print("\"" + segundo + "\" ");
            } else {
                System.out.print(numero[i] + " ");
            }
        }
        System.out.println();
    }
}