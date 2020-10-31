import java.util.Scanner;

public class loopWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int codigo, alcool, gasolina, diesel;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		codigo = sc.nextInt();
		
		while (codigo != 4) {
			switch(codigo) {
			case 1:
				alcool += 1;
				codigo = sc.nextInt();
				break;
			case 2:
				gasolina += 1;
				codigo = sc.nextInt();
				break;
			case 3:
				diesel += 1;
				codigo = sc.nextInt();
				break;
			default:
				System.out.println("Favor informar um novo codigo");
				codigo = sc.nextInt();
				break;
			}
		
			System.out.println("MUITO OBRIGADO");
			System.out.printf("Alcool: %d%n", alcool);
			System.out.printf("Gasolina: %d%n", gasolina);
			System.out.printf("Diesel: %d%n", diesel);
			
		}
		
		sc.close();
	}
}