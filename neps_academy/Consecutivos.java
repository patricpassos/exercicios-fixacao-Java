import java.util.Scanner;

public class Consecutivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Algoritmo de consecutivos
		int n = sc.nextInt();
		int[] vet = new int[n];

		int numAnterior = 0;
		int seqAtual = 0;
		int maiorSquencia = 0;
		boolean sinal = true;

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();

			int numAtual = vet[i];

			if (sinal) {
				numAnterior = numAtual;
				seqAtual = 1;
				maiorSquencia = 1;
				sinal = false;
			} else if (numAtual == numAnterior) {
				seqAtual++;
				maiorSquencia = Math.max(maiorSquencia, seqAtual);
			} else {
				numAnterior = numAtual;
				seqAtual = 1;
			}

		}

		System.out.println(maiorSquencia);

		sc.close();

	}

}
