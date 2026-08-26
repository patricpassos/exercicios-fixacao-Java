import java.util.Scanner;


public class SequenciaLogica1144 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			
			int y = x * x;
			int z = x * x * x;
			int a = y + 1;
			int b = z + 1;
			System.out.printf("%d %d %d%n", x, y, z);
			System.out.printf("%d %d %d%n", x, a, b);
			x += 1;
		}
		
		sc.close();

	}

}
