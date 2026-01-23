import java.util.Scanner;

public class ExercicioMatrizesMaiorElementoCadaLinha03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			int maior = mat[i] [0];
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			System.out.println(maior);
		}

		sc.close();

	}

}
