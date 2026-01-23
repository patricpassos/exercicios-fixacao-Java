import java.util.Scanner;

public class QuadradoCubo1143 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			
			int y = x * x;
			int z = x * x * x;
			System.out.printf("%d %d %d%n", x, y, z);
			
			x += 1;
		}
		
		sc.close();

	}

}
