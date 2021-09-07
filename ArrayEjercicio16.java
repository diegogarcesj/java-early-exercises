/**
 * Muestra un array de 20 números aleatorios. Pregunta si resaltar los múltiplos de 5 o de 7. Muestra el array resaltado.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio16 {
    public static void main(String[] args) {
        int alternativa;
        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++) {
            numeros[i] = (int)(Math.random()*401);
        }
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.print("¿Qué números quiere resaltar? (1 - múltiplos de 5, 2 - múltiplos de 7): ");
        alternativa = Integer.parseInt(System.console().readLine());
        switch (alternativa) {
            case 1:
                for (int i = 0; i < 20; i++) {
                    if (numeros[i] % 5 == 0) {
                        System.out.print("[" + numeros[i] + "] ");
                    }
                    else {
                        System.out.print(numeros[i] + " ");
                    }
                }
                System.out.println();
                break;
            case 2:
                for (int i = 0; i < 20; i++) {
                    if (numeros[i] % 7 == 0) {
                        System.out.print("[" + numeros[i] + "] ");
                    } else {
                        System.out.print(numeros[i] + " ");
                    }
                }
                System.out.println();
                break;
            default:
        }
    }
}