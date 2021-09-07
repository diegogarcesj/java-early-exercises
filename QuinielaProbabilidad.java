/**
 * Modificación de Quiniela para que 1 salga con prob. 1/2, X con prob. 1/3 y 2 con prob. 1/6.
 * 
 * @author Diego Garcés Jiménez
 */
public class Quiniela {
    public static void main(String[] args) {
        String sPrimero = "";
        String sSegundo = "";
        String sTercero = "";
        for (int i = 1; i <= 14; i++) {
            int primero = (int)(Math.random()*6); // Número aleatorio entre 0 y 5, incluidos.
            switch (primero) {
                case 0:
                    sPrimero = "1"; // Probabilidad 1/2 = 3/6
                    break;
                case 1:
                    sPrimero = "1";
                    break;
                case 2:
                    sPrimero = "1";
                    break;
                case 3:
                    sPrimero = "X"; // Probabilidad 1/3 = 2/6
                    break;
                case 4:
                    sPrimero = "X";
                    break;
                case 5:
                    sPrimero = "2"; // Probabilidad 1/6
                    break;
                default:
            }
            int segundo = (int)(Math.random()*6);
            switch (segundo) {
                case 0:
                    sSegundo = "1";
                    break;
                case 1:
                    sSegundo = "1";
                    break;
                case 2:
                    sSegundo = "1";
                    break;
                case 3:
                    sSegundo = "X";
                    break;
                case 4:
                    sSegundo = "X";
                    break;
                case 5:
                    sSegundo = "2";
                    break;
                default:
            }
            int tercero = (int)(Math.random()*6);
            switch (tercero) {
                case 0:
                    sTercero = "1";
                    break;
                case 1:
                    sTercero = "1";
                    break;
                case 2:
                    sTercero = "1";
                    break;
                case 3:
                    sTercero = "X";
                    break;
                case 4:
                    sTercero = "X";
                    break;
                case 5:
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