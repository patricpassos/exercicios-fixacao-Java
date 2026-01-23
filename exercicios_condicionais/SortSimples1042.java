import java.util.Scanner;

public class SortSimples1042 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;
		int mina, minb = 0, minc = 0;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		mina = Math.min(a, Math.min(b, c));

		if (mina == a) {
			minb = Math.min(b, c);
			minc = Math.max(b, c);
		}

		if (mina == b) {
			minb = Math.min(a, c);
			minc = Math.max(a, c);
		}

		if (mina == c) {
			minb = Math.min(a, b);
			minc = Math.max(a, b);
		}

		System.out.println(mina);
		System.out.println(minb);
		System.out.println(minc);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		sc.close();

	}

}
