/**
 * Muesta 20 notas al azar en la forma: suspenso, suficiente, bien, notable o sobresaliente.
 * Al final muestra el número de cada una de ellas.
 * 
 * @author Diego Garcés Jiménez
 */
public class NotasAzar {
    public static void main(String[] args) {
        int contSus = 0;
        int contSuf = 0;
        int contBien = 0;
        int contNot = 0;
        int contSobre = 0;
        for (int i = 1; i <= 20; i++){
            int nota = (int)(Math.random()*5);
            switch (nota) {
                case 0:
                    System.out.println("Suspenso");
                    contSus++;
                    break;
                case 1:
                    System.out.println("Suficiente");
                    contSuf++;
                    break;
                case 2:
                    System.out.println("Bien");
                    contBien++;
                    break;
                case 3:
                    System.out.println("Notable");
                    contNot++;
                    break;
                case 4:
                    System.out.println("Sobresaliente");
                    contSobre++;
                    break;
                default:
            }
        }
        System.out.println("Número de suspensos: " + contSus);
        System.out.println("Número de suficientes: " + contSuf);
        System.out.println("Número de bienes: " + contBien);
        System.out.println("Número de notables: " + contNot);
        System.out.println("Número de sobresalientes: " + contSobre);
    }
}