import java.util.Scanner;

public class SeisNumerosImpares1070 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cont = 0;
		while (cont < 6) {
			if (n % 2 != 0) {
				cont += 1;
				System.out.println(n);
			}
			n += 1;
		}

		sc.close();

	}

}
