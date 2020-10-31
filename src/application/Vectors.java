package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Guest;


// para o Ex2: import entities.Product;

public class Vectors {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Ex1
		int n = sc.nextInt();
		double[] vect = new double  [n];
		
		for (int i = 0; i < n; i ++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (int i = 0; i<n; i++) {
			sum += vect[i];
		}
		
		double average = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", average);
		*/
		
		/* Ex2
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/vect.length;
		System.out.printf("Average price: %.2f%n", avg);
		*/
		
		/*Loop for each
		 String[] vect = new String[] {Jesus, Maria, Jose};
		 for (String nomes : vect){
		 System.out.println(nomes);
		 }
		 */
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Guest[] vect = new Guest[10];
		
		for (int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name  = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Guest(name, email, room);
			System.out.println();
		}
		
		System.out.println("Busy Rooms:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();
	}

}
