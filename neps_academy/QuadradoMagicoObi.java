import java.util.Scanner;

public class QuadradoMagicoObi {

	public static int baseMatriz(int[][] mat) {
		int soma = 0;
		for (int j = 0; j < mat.length; j++) {
			soma += mat[0][j];
		}
		return soma;
	}

	public static boolean somaDiagonalPrincipal(int[][] mat, int baseMatriz) {
		int soma = 0;
		for (int i = 0; i < mat.length; i++) {
			soma += mat[i][i];
		}
		return baseMatriz == soma;
	}

	public static boolean somaDiagonalSecundaria(int[][] mat, int baseMatriz) {
		int soma = 0;
		for (int i = 0; i < mat.length; i++) {
			soma += mat[i][(mat.length - 1) - i];
		}
		return baseMatriz == soma;
	}

	public static boolean somaLinhas(int[][] mat, int baseMatriz) {
		for (int i = 0; i < mat.length; i++) {
			int somaLinhaAtual = 0;
			for (int j = 0; j < mat.length; j++) {
				somaLinhaAtual += mat[i][j];
			}
			if (somaLinhaAtual != baseMatriz) {
				return false;
			}
		}
		return true;
	}

	public static boolean somaColunas(int[][] mat, int baseMatriz) {
		for (int i = 0; i < mat.length; i++) {
			int somaColunaAtual = 0;
			for (int j = 0; j < mat.length; j++) {
				somaColunaAtual += mat[j][i];
			}
			if (somaColunaAtual != baseMatriz) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int baseMatriz = baseMatriz(mat);
		
		int quadradoMagico = (somaDiagonalPrincipal(mat, baseMatriz) && 
				              somaDiagonalSecundaria(mat, baseMatriz) &&
				              somaLinhas(mat, baseMatriz) &&
				              somaColunas(mat, baseMatriz)) ? baseMatriz : -1;
	
		System.out.println(quadradoMagico);

		sc.close();

	}

}
