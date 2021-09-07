/**
 * Muestra aleatoriamente una carta de la baraja española.
 * 
 * @author Diego Garcés Jiménez
 */
public class BarajaEspanola {
    public static void main(String[] args) {
        String naipe = "";
        int carta = (int)(Math.random()*10) + 1;
        switch (carta) {
            case 1:
                naipe = "As";
                break;
            case 2:
                naipe = String.valueOf(carta);
                break;
            case 3:
                naipe = String.valueOf(carta);
                break;
            case 4:
                naipe = String.valueOf(carta);
                break;
            case 5:
                naipe = String.valueOf(carta);
                break;
            case 6:
                naipe = String.valueOf(carta);
                break;
            case 7:
                naipe = String.valueOf(carta);
                break;
            case 8:
                naipe = "Sota";
                break;
            case 9:
                naipe = "Caballo";
                break;
            case 10:
                naipe = "Rey";
                break;
            default:
        }
        int pinta = (int)(Math.random()*4) + 1;
        switch (pinta) {
            case 1:
                naipe += " de oro";
                break;
            case 2:
                naipe += " de copa";
                break;
            case 3:
                naipe += " de espada";
                break;
            case 4:
                naipe += " de basto";
                break;
            default:
        }
        System.out.println(naipe);
    }
}