import java.util.Scanner;

public class ParesOuUltimosAlgarismo5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		for (int i = 0; i < 3; i++) {
			int n = sc.nextInt();
			if (n % 2 == 0 || n % 5 == 0) {
				cont++;
			}
		}

		System.out.println(cont);

		sc.close();

	}

}
