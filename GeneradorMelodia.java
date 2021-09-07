/**
 * Genera una melodía aleatoria.
 * 
 * @author Diego Garcés Jiménez
 */
public class GeneradorMelodia {
    public static void main(String[] args) {
        String sNota = "";
        String primeraNota = "";
        int longMelodia = (int)(Math.random()*7) + 1;
        for (int i = 1; i <= longMelodia - 1; i++){
            for (int j = 1; j <= 4; j++){
                int nota = (int)(Math.random()*7);
                switch (nota) {
                    case 0:
                        sNota = "do";
                        break;
                    case 1:
                        sNota = "re";
                        break;
                    case 2:
                        sNota = "mi";
                        break;
                    case 3:
                        sNota = "fa";
                        break;
                    case 4:
                        sNota = "sol";
                        break;
                    case 5:
                        sNota = "la";
                        break;
                    case 6:
                        sNota = "si";
                }
                if (i == 1 && j == 1) {
                    primeraNota = sNota;
                }
                System.out.print(sNota + " ");
            }
            System.out.print("| ");
        }
        for (int k = 1; k <= 3; k++) {
            int nota = (int)(Math.random()*7);
                switch (nota) {
                    case 0:
                        sNota = "do";
                        break;
                    case 1:
                        sNota = "re";
                        break;
                    case 2:
                        sNota = "mi";
                        break;
                    case 3:
                        sNota = "fa";
                        break;
                    case 4:
                        sNota = "sol";
                        break;
                    case 5:
                        sNota = "la";
                        break;
                    case 6:
                        sNota = "si";
                }
                if (longMelodia == 1 && k == 1) {
                    primeraNota = sNota;
                }
                System.out.print(sNota + " ");
        }
        System.out.print(primeraNota + " ||");
        System.out.println();
    }
}