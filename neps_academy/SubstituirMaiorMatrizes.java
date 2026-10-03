import java.util.Scanner;

public class SubstituirMaiorMatrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int maior = mat[0][0]; // inicia com o conteudo do primeiro indice
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (maior == mat[i][j]) {
					mat[i][j] = -1;
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
