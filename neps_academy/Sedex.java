import java.util.Scanner;

public class Sedex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int l = sc.nextInt();
		int p = sc.nextInt();

		if (n <= a && n <= l && n <= p) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

		sc.close();

	}

}
