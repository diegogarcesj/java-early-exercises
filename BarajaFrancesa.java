/**
 * Muestra aleatoriamente una carta de la baraja francesa.
 * 
 * @author Diego Garcés Jiménez
 */
public class BarajaFrancesa {
    public static void main(String[] args) {
        String naipe = "";
        int palo = (int)(Math.random()*4) + 1;
        switch (palo) {
            case 1:
                naipe = "Picas ";
                break;
            case 2:
                naipe = "Corazones ";
                break;
            case 3:
                naipe = "Diamantes ";
                break;
            case 4:
                naipe = "Tréboles ";
                break;
            default:
        }
        int carta = (int)(Math.random()*13) + 1;
        switch (carta) {
            case 1:
                naipe = naipe + "A";
                break;
            case 2:
                naipe += String.valueOf(carta);
                break;
            case 3:
                naipe += String.valueOf(carta);
                break;
            case 4:
                naipe += String.valueOf(carta);
                break;
            case 5:
                naipe += String.valueOf(carta);
                break;
            case 6:
                naipe += String.valueOf(carta);
                break;
            case 7:
                naipe += String.valueOf(carta);
                break;
            case 8:
                naipe += String.valueOf(carta);
                break;
            case 9:
                naipe += String.valueOf(carta);
                break;
            case 10:
                naipe += String.valueOf(carta);
                break;
            case 11:
                naipe += "J";
                break;
            case 12:
                naipe += "Q";
                break;
            case 13:
                naipe += "K";
                break;
            default:
        }
        System.out.println(naipe);
    }
}