/**
 * Calcula las horas transcurridas entre dos dias y horas introducidas por teclado.
 * 
 * @author Diego Garcés Jiménez
 */

public class DosDiasDosHoras {
    public static void main(String[] args ) {
        String sPrimerDia;
        String sSegundoDia;
        int primerDia = 0;
        int segundoDia = 0;
        int primeraHora;
        int segundaHora;
        int horasTrans = 0;
        boolean error = false;
        String msgError = "";

        System.out.println("Por favor, introduzca la primera hora.");
        System.out.print("Día: ");
        sPrimerDia = System.console().readLine();
        System.out.print("Hora: ");
        primeraHora = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduzca la segunda hora.");
        System.out.print("Día: ");
        sSegundoDia = System.console().readLine();
        System.out.print("Hora: ");
        segundaHora = Integer.parseInt(System.console().readLine());

        if (sPrimerDia.length() > 1) {
            switch (sPrimerDia) {
                case "lunes":
                    primerDia = 1;
                    break;
                case "martes":
                    primerDia = 2;
                    break;
                case "miercoles":
                    primerDia = 3;
                    break;
                case "jueves":
                    primerDia = 4;
                    break;
                case "viernes":
                    primerDia = 5;
                    break;
                case "sabado":
                    primerDia = 6;
                    break;
                case "domingo":
                    primerDia = 7;
                    break;
                default:
                    error = true;
                    msgError = "Error";
                    break;
            }
        } else {
            primerDia = Integer.parseInt(sPrimerDia);
        }
        if (sSegundoDia.length() > 1) {
            switch (sSegundoDia) {
                case "lunes":
                    segundoDia = 1;
                    break;
                case "martes":
                    segundoDia = 2;
                    break;
                case "miercoles":
                    segundoDia = 3;
                    break;
                case "jueves":
                    segundoDia = 4;
                    break;
                case "viernes":
                    segundoDia = 5;
                    break;
                case "sabado":
                    segundoDia = 6;
                    break;
                case "domingo":
                    segundoDia = 7;
                    break;
                default:
                    error = true;
                    msgError = "Error";
                    break;
            }
        } else {
            segundoDia = Integer.parseInt(sSegundoDia);
        }

        if (primerDia == segundoDia && primeraHora <= segundaHora) {
            horasTrans = segundaHora - primeraHora;            
        } else if ( (segundoDia - primerDia) == 1 ) {
            horasTrans = (24 - primeraHora) + segundaHora;
        } else if ( (segundoDia - primerDia) > 1 ) {
            horasTrans = (segundoDia - primerDia - 1) * 24 + (24 - primeraHora) + segundaHora;
        } else {
            error = true;
            msgError = "Error";
        }
        
        if (error == false) {
            System.out.println("Entre las " + primeraHora + ":00h del " + sPrimerDia + " y las " + segundaHora + ":00h del " + sSegundoDia + " hay " + horasTrans + " hora/s.");
        } else {
            System.out.println(msgError);
        }
    }
}