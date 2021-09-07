/**
 * Generación de números aleatorios.
 * 
 * @author Diego Garcés Jiménez
 */
 public class Aleatorio07 {
     public static void main(String[] args) {
         System.out.println("Muestra un día de la semana al azar:");

         int dia = (int)(Math.random()*7) + 1; // Genera un número aleatorio entre 1 y 7

         switch (dia) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miércoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sábado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
        }
     }
 }