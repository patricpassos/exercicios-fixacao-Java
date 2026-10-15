import java.util.Scanner;

public class DezValores {

	public static void proximosValores(int n) {
		for (int i = n + 1; i < n + 11; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		proximosValores(n);

		sc.close();

	}

}
