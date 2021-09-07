/**
 * Llena la pantalla con caracteres aleatorios a lo Matrix.
 * 
 * @author Diego Garcés Jiménez
 */
public class MatrixAleatorio {
    public static void main(String[] args) {
        for (int i = 1; i <= 4000; i++) {
            int numero = (int)(Math.random()*95) + 32;
            char caracter = (char)numero;
            System.out.print(caracter);
        }
        System.out.println();
    }
}