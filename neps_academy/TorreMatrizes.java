import java.util.Scanner;

public class TorreMatrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int[] vetSomaLinhas = new int[n];
		int[] vetSomaColunas = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			int somaLinhas = 0;
			int somaColunas = 0;
			for (int j = 0; j < n; j++) {
				somaLinhas += mat[i][j];
				somaColunas += mat[j][i];
			}
			vetSomaLinhas[i] = somaLinhas;
			vetSomaColunas[i] = somaColunas;
		}

		int pesoMaximo = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				int pesoAtual = vetSomaLinhas[i] + vetSomaColunas[j] - (2 * mat[i][j]);

				pesoMaximo = Math.max(pesoAtual, pesoMaximo);
			}
		}

		System.out.println(pesoMaximo);

		sc.close();

	}

}
