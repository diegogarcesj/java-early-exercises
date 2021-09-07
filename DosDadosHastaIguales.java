/**
 * Simula la tirada de dos dados. Continua tirando hasta que den el mismo valor.
 * 
 * @author Diego Garcés Jiménez
 */
public class DosDadosHastaIguales {
    public static void main(String[] args) {
        int dadoUno;
        int dadoDos;
        do {
            dadoUno = (int)(Math.random()*6) + 1;
            dadoDos = (int)(Math.random()*6) + 1;
            System.out.println("Dado 1: " + dadoUno + "\tDado 2: " + dadoDos);
        } while (dadoUno != dadoDos);
    }
}