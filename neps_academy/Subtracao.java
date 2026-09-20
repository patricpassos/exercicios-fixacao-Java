import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int subtracao = a - b;

		System.out.println(subtracao);

		sc.close();

	}

}
