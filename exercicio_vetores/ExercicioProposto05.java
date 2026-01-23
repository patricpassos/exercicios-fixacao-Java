import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}

		int somaPar = 0;
		int contPar = 0;
		for (int par : vet) {
			if (par % 2 == 0) {
				somaPar = somaPar + par;
				contPar += 1;
			}
		}

		double mediaPar = somaPar / contPar;
		System.out.printf("%.1f%n", mediaPar);

		sc.close();

	}

}
