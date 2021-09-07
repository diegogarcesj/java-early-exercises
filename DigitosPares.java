/** 
 * Dado un número entero introducido por teclado dice cuáles son los pares y los suma
 * 
 * @author Diego Garcés Jiménez
 */
public class DigitosPares {
    public static void main(String[] args) {
        
        long digito;
        long invertido = 0;
        int suma = 0;
                
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(System.console().readLine());

        while (numero != 0) { //Primero lo invertimos
            digito = numero % 10;
            numero /= 10; // Equivale a numero = numero / 10
            invertido = invertido * 10 + digito;
        }

        System.out.print("Dígitos pares: ");

        while (invertido != 0) {
            digito = invertido % 10;
            if (digito % 2 == 0){ // Comprobamos si los digitos son pares
                System.out.print(digito + " ");
                suma += digito; // Equivale a suma = suma + digito
            }
            invertido /= 10; //Equivale a invertido = invertido / 10
        }

        System.out.print("\n");
        System.out.println("Suma de los dígitos pares: " + suma);
    }
}