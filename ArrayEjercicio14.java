/** 
 * Pide diez palabras y ordena los colores antes de los no colores
 * 
 * @author Diego Garcés Jiménez 
 */
public class ArrayEjercicio14 {
    public static void main(String[] args) {
        String[] inicial = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] color = new String[8];
        String[] noColor = new String[8];
        String[] finale = new String[8];
        boolean esColor = false;
        int l = -1;
        int m = -1;
        // Pide ocho palabras y las almacena en el array inicial
        System.out.println("Introduzca 8 palabras:");
        for (int i = 0; i < 8; i++) {
            inicial[i] = System.console().readLine();
        }
        // Almacena los colores en el array color y los no colores en el array noColor
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (inicial[i].equals(colores[j])) {
                    esColor = true;
                }
            }
            if (esColor) {
                l++;
                color[l] = inicial[i];
            } else {
                m++;
                noColor[m] = inicial[i];
            }
            esColor = false;    // Reinicializa la variable booleana
        }
        // Ordena los colores antes de los no colores en el array final
        for (int i = 0; i <= l; i++) {
            finale[i] = color[i];
        }
        int i = l + 1;
        int j = 0;
        while (i < 8) {
            finale[i] = noColor[j];
            i++;
            j++;
        }
        // Muestra el array finale ordenado
        System.out.println("El array ordenado es:");
        for (String n : finale) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}