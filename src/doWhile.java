import java.util.Locale;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double c, f;
		char resp;
		
		
		do {
			System.out.println("Digite a teperatura em Celsius: ");
			c = sc.nextInt();
			f = c*9/5+32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.println("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
	}

}
