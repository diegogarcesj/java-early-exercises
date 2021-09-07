/**
 * El programa piensa un número entre 0 y 100 y el usuario tiene 5 oportunidades para adivinarlo.
 * 
 * @author Diego Garcés Jiménez
 */
public class AdivinaNumAzar {
    public static void main(String[] args) {
        int numPe = (int)(Math.random()*101); // Número aleatorio entre 0 y 100, ambos incluidos.
        for (int i = 1; i <= 5; i++) {
            System.out.print("Adivina el número entre 0 y 100 que estoy pensando: ");
            int numIn = Integer.parseInt(System.console().readLine());
            if (numPe == numIn) {
                System.out.println("¡Felicitaciones! Has adivinado.");
                i = 6; // Sale del bucle.
            } else {
                System.out.println("Fallaste. Te quedan " + (5 - i) + " oportunidades.");
                if (numIn - numPe > 0) {
                    System.out.println("El número introducido es mayor al que estoy pensando.");
                } else if (numIn - numPe < 0) {
                    System.out.println("El número introducido es menor al que estoy pensando.");
                }
            }
        }
    }
}