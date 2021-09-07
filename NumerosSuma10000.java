/**
 * Permite introducir números hasta que la suma no supere 10000. 
 * Cuando ocurra se muestra el total acumulado, el contador de números y la media.
 * 
 * @author Diego Garcés Jiménez
 */

public class NumerosSuma10000 {
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;
        double media;

        System.out.println("Introduzca números (se detendrá cuando sumen 10000): ");
        while (suma <= 10000) {
            int numero = Integer.parseInt(System.console().readLine());
            contador++;
            suma += numero;
        }
        
        media = suma / contador;

        System.out.println("El total acumulado es: " + suma);
        System.out.println("El contador de números es: " + contador);
        System.out.println("La media de los números es: " + media);
    }
}