/**
 * Cuestionario con puntaje.
 * 
 * @author Diego Garcés Jiménez
 */

public class CuestionarioPuntaje {
	public static void main(String[] args) {
		
		int puntaje = 0;
		
		System.out.print("1. Lenguaje de programación multiplataforma: ");
		String respuesta1 = System.console().readLine();
		if (respuesta1.equals("java")){
			puntaje = puntaje + 1;
		}
		
		System.out.print("2. Actual distribución de GNU/Linux: ");
		String respuesta2 = System.console().readLine();
		if (respuesta2.equals("debian")){
			puntaje++;
		}
		
		System.out.print("3. Futura profesión: ");
		String respuesta3 = System.console().readLine();
		if (respuesta3.equals("programador")){
			puntaje++;
		}
		
		System.out.print("4. Método principal de un programa: ");
		String respuesta4 = System.console().readLine();
		if (respuesta4.equals("main")){
			puntaje++;
		}
		
		System.out.print("5. Mostrar por pantalla texto con salto de línea: ");
		String respuesta5 = System.console().readLine();
		if (respuesta5.equals("System.out.println")){
			puntaje++;
		}
		
		System.out.print("6. Sentencia condicional si: ");
		String respuesta6 = System.console().readLine();
		if (respuesta6.equals("if")){
			puntaje++;
		}
		
		System.out.print("7. Sentencia condicional para menú: ");
		String respuesta7 = System.console().readLine();
		if (respuesta7.equals("switch")){
			puntaje++;
		}
		
		System.out.print("8. Series por internet: ");
		String respuesta8 = System.console().readLine();
		if (respuesta8.equals("netflix")){
			puntaje++;
		}
		
		System.out.print("9. Sitio web con ofertas para programadores: ");
		String respuesta9 = System.console().readLine();
		if (respuesta9.equals("getonbrd.cl")){
			puntaje++;
		}
		
		System.out.print("10. IDE de Java de Oracle: ");
		String respuesta10 = System.console().readLine();
		if (respuesta10.equals("netbeans")){
			puntaje++;
		}
		
		System.out.println("\nPuntaje obtenido: " + puntaje);
	}
}
