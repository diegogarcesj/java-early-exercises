/**
 * Muestra horario a colores.
 *
 * @author Diego Garcés
 */

public class HorarioColores {
  public static void main(String[] args) {
  
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String azul = "\033[34m";
    String blanco = "\033[37m";
    
    System.out.println(blanco + "\tLunes\tMartes\tMiérc.\tJueves\tViernes\tSábado\tDomingo");
    System.out.println(blanco + "9:00" + azul + "\tDesp.\tDesp.\tDesp.\tDesp.\tDesp.\tDesp.\tDesp.");
    System.out.println(blanco + "11:00" + rojo + "\tCama\tCama\tCama\tCama\tCama\tCama\tCama");
    System.out.println(blanco + "12:00" + verde + "\tLeer\tLeer\tLeer\tLeer\tLeer\tLeer" + rojo + "\tTrabajar");
    System.out.println(blanco + "14:00" + rojo + " \tAlmorz.\tAlmorz.\tAlmorz.\tAlmorz.\tAlmorz.\tAlmorz.\tAlmorz.");
    System.out.println(blanco + "15:00" + verde + "\tEstud.\tEstud.\tEstud.\tEstud.\tEstud.\tEstud." + rojo + "\tTrabajar");
    System.out.println(blanco + "18:00" + azul + " \tCicli." + verde + "\tEstud." + azul + "\tCicli." + verde + "\tEstud." + azul + "\tCicli." + verde + "\tEstud." + rojo + "\tTrabajar");
    System.out.println(blanco + "19:00" + rojo + "\tOnce\tOnce\tOnce\tOnce\tOnce\tOnce" + rojo +"\tTrabajar");
    System.out.println(blanco + "21:00" + verde + " \tProgra.\tProgra.\tProgra.\tProgra.\tProgra.\tProgra." + rojo + "\tOnce");
    System.out.println(blanco + "23:00" + azul + "\tDormir\tDormir\tDormir\tDormir\tDormir\tDormir\tDormir");
  }
}
