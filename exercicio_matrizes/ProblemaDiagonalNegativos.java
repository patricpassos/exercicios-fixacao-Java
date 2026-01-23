import java.util.Scanner;

public class ProblemaDiagonalNegativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}

		// A diagonal de uma matriz e caracterizada pelas i = j
		System.out.println("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " "); // a linha [i] e a coluna [i]
		}
		System.out.println();

		int contNegativo = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					contNegativo++;
				}
			}
		}

		System.out.println("QUANTIDADE DE NEGATIVO = " + contNegativo);

		sc.close();

	}

}
