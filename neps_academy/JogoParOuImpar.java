import java.util.Scanner;

public class JogoParOuImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();

		int soma = d1 + d2;
		if (p == 0) {
			if (soma % 2 == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		} else if (p == 1) {
			if (soma % 2 == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

		sc.close();

	}

}
