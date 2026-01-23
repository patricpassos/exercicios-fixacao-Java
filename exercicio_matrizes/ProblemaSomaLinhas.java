import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaLinhas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt(); // linhas
		System.out.print("Qua a quantidade de colunas da matriz? ");
		int n = sc.nextInt(); // colunas

		double[][] mat = new double[m][n];
		double[] vetSoma = new double[m];

		for (int i = 0; i < m; i++) {
			System.out.printf("Digite os elementos da %d° linha:\n", i + 1);
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		// Matriz para soma os valores
		for (int i = 0; i < m; i++) {
			double soma = 0.0; // variavel que acumula a soma das linhas
			for (int j = 0; j < n; j++) {
				soma += mat[i][j];
			}
			vetSoma[i] = soma; // vetor para guardar os valores da soma apos terminar a interação do for interno
		}

		System.out.println("VETOR GERADO:");
		for (int i = 0; i < m; i++) {
			System.out.println(vetSoma[i]);
		}

		sc.close();

	}

}
