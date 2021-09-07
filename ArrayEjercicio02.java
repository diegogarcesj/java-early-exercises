/**
 * Define un array de 10 caracteres. Asigna algunos valores. Los muestra todos.
 * 
 * @author Diego Garcés Jiménez
 */
public class ArrayEjercicio02 {
    public static void main(String[] args) {

        char[] simbolo = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for (int i = 0; i < 10; i++) {
            System.out.print(simbolo[i] + "");
        }
        System.out.println();
    }
}