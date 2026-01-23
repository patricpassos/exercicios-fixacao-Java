import java.util.Scanner;

public class ExercicioProposto06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			idade[i] = sc.nextInt();
		}

		/*
		 * Definir a pessoa com a maior idade dentro da coleção
		 */
		int maior = idade[0];
		int posicao = 0;
		for (int i = 1; i < n; i++) {
			if (idade[i] > maior) {
				maior = idade[i];
				posicao = i;
			}
		}

		System.out.println("Pessoa mais velha: " + nomes[posicao]);

		sc.close();

	}

}
