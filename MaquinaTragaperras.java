/**
 * Simulador de una máquina tragaperras simplificada.
 * 
 * @author Diego Garcés Jiménez
 */
public class MaquinaTragaperras {
    public static void main(String[] args) {
        String primeraFigura = "";
        String segundaFigura = "";
        String terceraFigura = "";
        String sFigura = "";
        for (int i = 1; i <= 3; i++) {
            int figura = (int)(Math.random()*5);
            switch (figura) {
                case 0:
                    sFigura = "corazón";
                    break;
                case 1:
                    sFigura = "diamante";
                    break;
                case 2:
                    sFigura = "herradura";
                    break;
                case 3:
                    sFigura = "campana";
                    break;
                case 4:
                    sFigura = "limón";
                    break;
                default:
            }
            if (i == 1) {
                primeraFigura = sFigura;
            } else if (i == 2) {
                segundaFigura = sFigura;
            } else if (i == 3) {
                terceraFigura = sFigura;
            }
        }
        System.out.println(primeraFigura + " " + segundaFigura + " " + terceraFigura);
        if (primeraFigura.equals(segundaFigura) && segundaFigura.equals(terceraFigura)){
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if ( !(primeraFigura.equals(segundaFigura)) && !(segundaFigura.equals(terceraFigura)) && !(primeraFigura.equals(terceraFigura))) {
            System.out.println("Lo siento, ha perdido");
        } else if ( ( primeraFigura.equals(segundaFigura) && !(segundaFigura.equals(terceraFigura) ) ) || ( segundaFigura.equals(terceraFigura)  && !( primeraFigura.equals(terceraFigura) ) ) || ( primeraFigura.equals(terceraFigura) && !(segundaFigura.equals(terceraFigura)) ) ) {
            System.out.println("Bien, ha recuperado su moneda");
        }
    }
}