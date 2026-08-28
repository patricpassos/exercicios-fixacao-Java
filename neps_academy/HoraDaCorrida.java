import java.util.Scanner;

public class HoraDaCorrida {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalDeVoltas = sc.nextInt();
		int totalDePlacas = sc.nextInt();

		int totalGeralDePlacas = totalDeVoltas * totalDePlacas;

		for (int i = 10; i < 100; i += 10) {
			double quantidadeDePlacas = Math.ceil(i / 100.0 * totalGeralDePlacas);
			System.out.printf("%.0f ", quantidadeDePlacas);
		}

		sc.close();

	}

}
