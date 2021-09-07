/**
 * Rellena un array de 100 elementos con números aleatorios entre 0 y 500, ambos incluidos.
 * Pregunta si quiere destacar el mínimo o el máximo, y muestra el array con el número destacado con doble asteriscos.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio13 {
    public static void main(String[] args) {
        int[] numero = new int[100];
        int minimo = 500;
        int maximo = 0;
        // genera el array de números aleatorios
        for (int i = 0; i < 100; i++) {
            numero[i] = (int)(Math.random()*501);
        }
        // muestra el array
        for (int n : numero) {
            System.out.print(n + " ");
        }
        System.out.println();
        // determina el minimo y el maximo
        for (int i = 0; i < 100; i++) {
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
        }
        // pregunta si destacar el minimo o el maximo
        System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
        int opcion = Integer.parseInt(System.console().readLine());
        // muestra el array con el minimo o maximo marcado
        switch (opcion) {
            case 1:
                for (int n : numero) {
                    if (n == minimo) {
                        System.out.print("**" + n + "** ");
                    } else {
                        System.out.print(n + " ");
                    }
                }
                break;
            case 2:
                for (int n : numero) {
                    if (n == maximo) {
                        System.out.print("**" + n + "** ");
                    } else {
                        System.out.print(n + " ");
                    }
                }
                break;
            default:
                System.out.print("Error.");
        }
        System.out.println();
    }
}