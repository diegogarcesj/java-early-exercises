/**
 * Muestra tres apuesta de quiniela en tres columnas para los catorce partidos y el pleno al quince.
 * 
 * @author Diego Garcés Jiménez
 */
public class Quiniela {
    public static void main(String[] args) {
        String sPrimero = "";
        String sSegundo = "";
        String sTercero = "";
        for (int i = 1; i <= 14; i++) {
            int primero = (int)(Math.random()*3); // Número aleatorio entre 0 y 2, incluidos.
            switch (primero) {
                case 0:
                    sPrimero = "1";
                    break;
                case 1:
                    sPrimero = "X";
                    break;
                case 2:
                    sPrimero = "2";
                    break;
                default:
            }
            int segundo = (int)(Math.random()*3);
            switch (segundo) {
                case 0:
                    sSegundo = "1";
                    break;
                case 1:
                    sSegundo = "X";
                    break;
                case 2:
                    sSegundo = "2";
                    break;
                default:
            }
            int tercero = (int)(Math.random()*3);
            switch (tercero) {
                case 0:
                    sTercero = "1";
                    break;
                case 1:
                    sTercero = "X";
                    break;
                case 2:
                    sTercero = "2";
                    break;
                default:
            }
            System.out.println(i + ".-\t" + sPrimero + "\t" + sSegundo + "\t" + sTercero);
        }
        String sPleno = "";
        int pleno = (int)(Math.random()*4); // Número aleatorio entre 0 y 3, incluidos.
        switch (pleno) {
            case 0:
                sPleno = "0";
                break;
            case 1:
                sPleno = "1";
                break;
            case 2:
                sPleno = "2";
                break;
            case 3:
                sPleno = "M";
                break;
            default:
        }
        System.out.println("15.-\t" + sPleno);
    }
}