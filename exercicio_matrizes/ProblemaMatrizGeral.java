import java.util.Locale;
import java.util.Scanner;

public class ProblemaMatrizGeral {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();

		double[][] mat = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextDouble();
			}
		}

		double somaPositivo = 0.0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > 0.0) {
					somaPositivo += mat[i][j];
				}
			}
		}

		System.out.printf("\nSOMA DOS POSITIVOS: %.1f\n\n", somaPositivo);

		System.out.print("Escolha uma linha: ");
		int linha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (linha == i) {
					System.out.printf("%.1f ", mat[i][j]);
				}
			}
		}

		System.out.print("\n\nEscolha uma coluna: ");
		int coluna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (coluna == j) {
					System.out.printf("%.1f ", mat[i][j]);
				}
			}
		}

		System.out.print("\n\nDIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0.0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}

		System.out.println("\n\nMATRIZ ALTERADA:");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}

		sc.close();

	}

}
