import java.util.Scanner;

public class problemaCadaLinhaMaior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		for (int i = 0; i < n; i++) {
			int maior = 0;
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
