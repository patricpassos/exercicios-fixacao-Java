import java.util.Scanner;

public class ExercicioMatrizesSomaAcimaDiagonal04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		// Input dos valores dentro da matriz
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int soma = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) { // j = i + 1 entre os retornos de j recebe 1 + i + 1
				soma = soma + mat[i][j];
			}
		}

		System.out.println(soma);
		sc.close();

	}

}
