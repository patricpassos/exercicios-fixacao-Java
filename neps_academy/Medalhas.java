import java.util.Scanner;

public class Medalhas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();

		if (t1 < t2 && t1 < t3) {
			System.out.println(1);
			if (t2 < t3) {
				System.out.println(2);
				System.out.println(3);
			} else {
				System.out.println(3);
				System.out.println(2);
			}
		} else if (t2 < t1 && t2 < t3) {
			System.out.println(2);
			if (t1 < t3) {
				System.out.println(1);
				System.out.println(3);
			} else {
				System.out.println(3);
				System.out.println(1);
			}
		} else {
			System.out.println(3);
			if (t1 < t2) {
				System.out.println(1);
				System.out.println(2);
			} else {
				System.out.println(2);
				System.out.println(1);
			}
		}

		sc.close();
	}

}
