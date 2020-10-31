import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String nome = "Douglas";
		int idade = 69;
		double salario = 4200.69;
		System.out.printf("%s tem %d anos e recebe %.2f por mês%n",nome, idade, salario);
		System.out.println("é nois.");
		
		double b, B, H, area;
		
		b = 6.0;
		B = 8.0;
		H = 5.0;
		area = (b + B) / 2 * H;
		System.out.println(area);
		
		int x, y;
		double resultado;
		
		x = 5;
		y = 2;
		resultado = (double) x / y;
		System.out.println(resultado);
		
		
		
		/*delimitador de caractéres Dobule: %.2f
		 * quebra de linha para delimitador: %n ou /n
		 * marcadores: %f = flutuantes, %d = inteiros, %s = texto, %n = quebra de linha
		 */
	}

}
