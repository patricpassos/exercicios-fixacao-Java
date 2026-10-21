import java.util.Scanner;

public class ChuvaObi2011 {

	public static void regiaoA(int[][] matA, Scanner sc) {
		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matA.length; j++) {
				matA[i][j] = sc.nextInt();
			}
		}
	}

	public static void regiaoB(int[][] matB, Scanner sc) {
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				matB[i][j] = sc.nextInt();
			}
		}
	}

	public static void resultado(int[][] matC, int[][] matA, int[][] matB) {
		for (int i = 0; i < matC.length; i++) {
			for (int j = 0; j < matC.length; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matA = new int[n][n];
		int[][] matB = new int[n][n];
		int[][] matC = new int[n][n];

		regiaoA(matA, sc);
		regiaoB(matB, sc);
		resultado(matC, matA, matB);

		sc.close();

	}

}
