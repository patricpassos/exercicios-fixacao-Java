import java.util.Scanner;

public class Tomadas {

	public static int somaTomadas(Scanner sc) {
		int soma = 0;
		for (int i = 0; i < 4; i++) {
			int t = sc.nextInt();
			soma += t;
		}
		return soma - 3;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int somaTomadas = somaTomadas(sc);

		System.out.println(somaTomadas);

		sc.close();

	}

}
