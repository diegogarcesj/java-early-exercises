/**
 * Pide un número por teclado y lo muestra al revés.
 *
 * @author Diego Garcés Jiménez
 */

 public class NumeroAlReves {
     public static void main(String[] args) {
         int dig;
         int inv = 0;

         System.out.print("Introduzca un número: ");
         int num = Integer.parseInt(System.console().readLine());

         while (num != 0) {
            dig = num % 10;
            num = num / 10;
            inv = inv * 10 + dig;
         }

         System.out.println("El número al revés es " + inv);
     }
 }
