import java.util.Locale;
import java.util.Scanner;

public class condicionalTernaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, desconto;
		
		preco = sc.nextDouble();
		
		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("Valor do desconto: %.2f%n", desconto);

		sc.close();
	}

}
