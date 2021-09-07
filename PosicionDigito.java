/**
 * Pide un número y un digito. Luego da la posición de izq. a der. que ocupa el digito en el número.
 * 
 * @author Diego Garcés Jiménez
 */

public class PosicionDigito {
    public static void main(String[] args) {

        int posIzqDer = 0;
        int cifra;
        int inv = 0;
        boolean encontrado = false;

        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un digito: ");
        int digito = Integer.parseInt(System.console().readLine());

        while (numero != 0 ) {      // Primero lo invertimos
            cifra = numero % 10;
            numero = numero / 10;
            inv = inv * 10 + cifra;
        }
        System.out.print("Posición/es: ");
        while (inv != 0) { 
            cifra = inv % 10;
            posIzqDer++;
            if (cifra == digito) {
                encontrado = true;
                System.out.print(posIzqDer + " ");
            }
            inv = inv / 10;
        }
        if (encontrado == false) {
            System.out.print("No se ha encontrado el digito en el número.");
        }
        System.out.print("\n");
    }
}