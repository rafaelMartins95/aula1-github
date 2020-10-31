import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		salario = sc.nextDouble();
		
		if (salario <= 2000) {
			imposto = 0;
		}
		else if(salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		}
		else if(salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 80;
		}
		else {
			imposto = (salario - 4500) * 0.28 + 350;
		}
		
		if (salario <= 2000) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
		
	}
}
