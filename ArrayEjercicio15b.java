/**
 * Aplicación para colocar clientes en sus mesas.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio15b {
    public static void main(String[] args) {
        int[] mesa = new int[10];
        int numero;
        int vacia = 10;
        boolean hayVacia = false;
        int espacioJusto = 10;
        boolean hayEspacioJusto = false;
        int espacio = 10;
        boolean hayEspacio = false;

        for (int i = 0; i < 10; i++) {
            mesa[i] = (int)(Math.random()*5);
        }
        do {
            System.out.println("Mesa nº   : 1 2 3 4 5 6 7 8 9 10");
            System.out.print("Ocupación : ");
            for (int i = 0; i < 10; i++) {
                System.out.print(mesa[i] + " ");
            }
            System.out.println();
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            numero = Integer.parseInt(System.console().readLine());
            if (numero > 0 && numero <= 4) {
                for (int i = 9; i >= 0; i--) {
                    if (mesa[i] == 0) {
                        hayVacia = true;
                        vacia = i;
                    } else if (mesa[i] + numero == 4) {
                        hayEspacioJusto = true;
                        espacioJusto = i;
                    } else if (mesa[i] + numero < 4) {
                        hayEspacio = true;
                        espacio = i;
                    }
                }
                if (hayVacia) {
                    System.out.println("Por favor, siéntese en la mesa número " + (vacia + 1) + ".");
                    mesa[vacia] = numero; 
                } else if (hayEspacioJusto) {
                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa " + (espacioJusto + 1) + ".");
                        mesa[espacioJusto] = mesa[espacioJusto] + numero;
                } else if (hayEspacio) {
                            System.out.println("Tendrán que compartir mesa. Por favor, siéntese en la mesa " + (espacio + 1) + ".");
                            mesa[espacio] = mesa[espacio] + numero;
                } else {
                            System.out.println("Lo siento, en estos momentos no queda sitio.");
                }
                hayVacia = false;
                vacia = 10;
                hayEspacioJusto = false;
                espacioJusto = 10;
                hayEspacio = false;
                espacio = 10;
            } else if (numero > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + numero + ", haga grupos de 4 personas como máximo e intente de nuevo.");
            }
        } while (numero >= 0);
    }
}      