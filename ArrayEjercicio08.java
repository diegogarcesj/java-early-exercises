/**
 * Pide las temperaturas medias de cada mes y muestra un gráfico de barras horizontales con los datos.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio08 {
    public static void main(String[] args) {
        int[] temperatura = new int[12];
        String[] mes = new String[12];
        System.out.println("Introduzca las temperaturas medias por mes:");
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                    mes[i] = "Enero";
                    break;
                case 1:
                    mes[i] = "Febrero";
                    break;
                case 2:
                    mes[i] = "Marzo";
                    break;
                case 3:
                    mes[i] = "Abril";
                    break;
                case 4:
                    mes[i] = "Mayo";
                    break;
                case 5:
                    mes[i] = "Junio";
                    break;
                case 6:
                    mes[i] = "Julio";
                    break;
                case 7:
                    mes[i] = "Agosto";
                    break;
                case 8:
                    mes[i] = "Septiembre";
                    break;
                case 9:
                    mes[i] = "Octubre";
                    break;
                case 10:
                    mes[i] = "Noviembre";
                    break;
                case 11:
                    mes[i] = "Diciembre";
                    break;
                default:
            }
            System.out.print(mes[i] + ": ");
            temperatura[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Gráfico de temperaturas:");
        for (int i = 0; i < 12; i++) {
            System.out.print(mes[i]);
            if (i == 8 || i == 10 || i == 11) {
                System.out.print("\t");
            } else {
                System.out.print("\t\t");
            }
            for (int j = 1; j <= temperatura[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}