import java.util.Scanner;

public class SaldoDoVovo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int s = sc.nextInt();

		int menor = s;
		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			s += v;
			menor = Math.min(menor, s);
		}

		System.out.println(menor);

		sc.close();

	}

}
