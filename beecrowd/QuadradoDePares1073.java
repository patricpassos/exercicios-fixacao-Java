import java.util.Scanner;

public class QuadradoDePares1073 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				int x = i * i;
				System.out.println(i + "^2 = " + x);
			}
		}

		sc.close();

	}

}
