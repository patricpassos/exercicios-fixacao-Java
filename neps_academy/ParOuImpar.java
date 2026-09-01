import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int bino = sc.nextInt();
		int cino = sc.nextInt();

		int soma = bino + cino;

		System.out.println((soma % 2 == 0) ? "Bino" : "Cino");

		sc.close();

	}

}
