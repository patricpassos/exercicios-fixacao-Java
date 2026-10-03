import java.util.Scanner;

public class EntregaDeCaixas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if ((a + b < c) || (a < b && b < c)) {
			System.out.println(1);
		} else if (a < b || b < c) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}

		sc.close();

	}

}
