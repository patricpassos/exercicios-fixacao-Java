import java.util.Scanner;

public class Ogro02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num == 0) {
			System.out.println("*");
			System.out.println("*");
		} else if (num <= 5) {
			System.out.print("I".repeat(num));
			System.out.println();
			System.out.println("*");
		} else {
			System.out.print("I".repeat(5));
			System.out.println();
			System.out.println("I".repeat(num - 5));
		}

		sc.close();

	}

}
