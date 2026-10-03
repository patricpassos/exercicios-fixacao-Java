import java.util.Scanner;

public class SomaDasLinhasMatrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < mat.length; i++) {
			int soma = 0;
			for (int j = 0; j < mat.length; j++) {
				soma += mat[i][j];
			}
			System.out.println("Linha " + i + ": " + soma);
		}

		sc.close();
	}

}
