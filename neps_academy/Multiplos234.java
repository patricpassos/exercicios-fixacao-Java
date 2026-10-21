import java.util.Scanner;

public class Multiplos234 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();

			if (num % 2 == 0) {
				cont2++;
			}
			if (num % 3 == 0) {
				cont3++;
			}
			if (num % 4 == 0) {
				cont4++;
			}

		}

		System.out.println(cont2);
		System.out.println(cont3);
		System.out.println(cont4);

		sc.close();

	}

}
