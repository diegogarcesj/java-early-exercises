/**
 * Pide 10 números, muestra el array con los índices, pide un número inicial y final,
 * pone el inicial en la posición del final, rotando los demás números del array.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio12 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int auxFin;
        int auxIni;

        System.out.println("Introduzca diez números:");
        for (int i = 0; i < 10; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
        }
        
        System.out.println("El array inicial:");
        System.out.print("Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.print("Valor  ");
        for (int n : numero) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("Introduzca el índice inicial: ");
        int inicial = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el índice final: ");
        int finale = Integer.parseInt(System.console().readLine());

        if ((inicial < finale) && (inicial >= 0 && inicial <= 9) && (finale >= 0 && finale <= 9)) {
            auxFin = numero[9];
            auxIni = numero[inicial];
            for (int i = inicial; i > 0; i--) {
                numero[i] = numero[i - 1];
            }
            for (int i = 9; i > finale; i--) {
                numero[i] = numero[i - 1];
            }
            numero[finale] = auxIni;
            numero[0] = auxFin;

            System.out.println("El array final:");
            System.out.print("Índice ");
            for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            }
            System.out.println();

            System.out.print("Valor  ");
            for (int n : numero) {
            System.out.print(n + " ");
            }
            System.out.println();

        } else {
            System.out.println("Error.");
        }
    }
}