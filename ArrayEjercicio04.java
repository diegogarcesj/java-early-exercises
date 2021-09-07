/**
 * Define tres arrays de 20 números cada uno: numero, con numeros aleatorios entre 0 y 100; 
 * cuadrado, con los cuadrados; y cubo, con los cubos. Los muestra en tres columnas.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio04 {
    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random()*101);
        }

        for (int i = 0; i < 20; i++) {
            cuadrado[i] = numero[i] * numero[i];
        }

        for (int i = 0; i < 20; i++) {
            cubo[i] = cuadrado[i] * numero [i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(numero[i] + "\t" + cuadrado[i] + "\t" + cubo[i]);
        }
    }
}