import java.util.Scanner;

public class DarioXerxes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int dario = 0;
		int xerxes = 0;
		for (int i = 0; i < n; i++) {
			int d = sc.nextInt();
			int x = sc.nextInt();

			int distancia = (x - d + 5) % 5; // Aritmética modula (os valores voltam ao zero)

			dario = (distancia <= 2) ? dario++ : xerxes++;

		}

		String vencedor = (dario > xerxes) ? "dario" : "xerxes";

		System.out.println(vencedor);

		sc.close();

	}

}
