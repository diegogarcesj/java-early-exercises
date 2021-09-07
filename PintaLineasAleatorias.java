/**
 * Pinta 10 líneas cuyo caracter y longitud es aleatorio.
 * 
 * @author Diego Garcés Jiménez
 */
public class PintaLineasAleatorias {
    public static void main(String[] args) {
        String car = "";
        int caracter = (int)(Math.random()*6); // Aleatorio del 0 al 5
        switch (caracter) {
            case 0:
                car = "*";
                break;
            case 1:
                car = "-";
                break;
            case 2:
                car = "=";
                break;
            case 3:
                car = ".";
                break;
            case 4:
                car = "|";
                break;
            case 5:
                car = "@";
                break;
            default:
        }
        for (int i = 1; i <= 10; i++) {
            int longitud = (int)(Math.random()*40) + 1; // Aleatorio del 1 al 40
            for (int j = 1; j <= longitud; j++) {
                System.out.print(car);
            }
            System.out.println();
        }
    }
}