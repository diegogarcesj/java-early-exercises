/** 
 * Muestra la tirada de tres dados y la suma. 
 * 
 * @author Diego Garcés Jiménez
 */
public class TresDados {
    public static void main(String[] args) {
        int suma = 0;
        System.out.println("Se tiran tres dados:");
        for (int i = 1; i <= 3; i++) {
            int dado = (int)(Math.random()*6) + 1;
            suma = suma + dado;
            System.out.println("Dado " + i + ": " + dado);
        }
        System.out.println("La suma de los tres dados: " + suma);
    }
}