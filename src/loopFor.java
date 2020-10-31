import java.util.Scanner;

public class loopFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int quad = (int)Math.pow(i, 2);
			int  cube = (int)Math.pow(i, 3);
			System.out.printf("%d %d %d%n", i, quad, cube);
		}
		
		sc.close();
		}

	}


