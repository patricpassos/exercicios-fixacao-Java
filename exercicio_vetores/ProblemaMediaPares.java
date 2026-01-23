import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		int somaPar = 0;
		int contPar = 0;
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				somaPar += vet[i];
				contPar++;
			}
		}

		if (somaPar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double mediaPar = somaPar / contPar;
			System.out.printf("MÉDIA PARES: %.1f\n", mediaPar);
		}

		sc.close();

	}

}
