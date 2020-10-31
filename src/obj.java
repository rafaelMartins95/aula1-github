import java.util.Locale;
import java.util.Scanner;

public class obj {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X");
		double xa, xb, xc;
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y");
		double ya, yb, yc;
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double areaX = triArea(xa, xb, xc);
		double areaY = triArea(ya, yb, yc);
		
		compareTriArea(areaX, areaY);		
		sc.close();
	}
	
	public static double triArea(double a, double b, double c) {
		double p = (a+b+c) / 2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
	public static void compareTriArea(double triX, double triY) {
		System.out.printf("Triangle X area: %.4f%n", triX);
		System.out.printf("Triangle Y area: %.4f%n", triY);
		if (triX > triY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
	}
}
