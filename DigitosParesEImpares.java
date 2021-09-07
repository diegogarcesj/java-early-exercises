/**
 * Dados dos números introducidos por teclado, arma un número con los pares y otro con los impares;
 * 
 * @author Diego Garcés Jiménez
 */
public class DigitosParesEImpares {
    public static void main(String[] args) {

        long primNum;
        long segNum;
        long primInv = 0;
        long segInv = 0;
        long digPares = 0;
        long digImpares = 0; 
        long digito;

        System.out.print("Por favor, introduzca un número: ");
        primNum = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca otro número (igual longitud): ");
        segNum = Long.parseLong(System.console().readLine());

        while (primNum != 0) {  // Invertimos el primer numero
            digito = primNum % 10;
            primNum = primNum / 10;
            primInv = primInv * 10 + digito;
        }
        while (segNum != 0) {   // Invertimos el segundo numero
            digito = segNum % 10;
            segNum = segNum / 10;
            segInv = segInv * 10 + digito;
        }

        while (primInv != 0 && segInv != 0) { // Comprobamos en el orden del enunciado
            digito = primInv % 10;
            primInv = primInv / 10;
            if (digito % 2 == 0) {
                digPares = digPares * 10 + digito;
            } else {
                digImpares = digImpares * 10 + digito;
            }
            digito = segInv % 10;
            segInv = segInv / 10;
            if (digito % 2 == 0) {
                digPares = digPares * 10 + digito;
            } else {
                digImpares = digImpares * 10 + digito;
            }
        }
        System.out.println("El número formado por los dígitos pares es " + digPares);
        System.out.println("El número formado por los dígitos impares es " + digImpares);
    }
}