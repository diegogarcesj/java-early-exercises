/**
 * Genera números aleatorios pares entre 0 y 100 hasta que salga el 24; cuenta cuantos se han generado.
 * 
 * @author Diego Garcés Jiménez
 */
public class NumAleatoriosParesHasta24 {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        do {
            numero = (int)(Math.random()*101); // Número aleatorio del 0 al 100, inclusive.
            if (numero % 2 == 0) {  // Si es par, se cuenta y se muestra
                contador++;
                System.out.print(numero + " ");
            }
        } while (numero != 24); // Se repite mientras no sea 24
        System.out.println();
        System.out.println("Cantidad de números generados: " + contador);
    }
}