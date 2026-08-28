import java.util.Scanner;

public class BatalhaNaval {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] tabuleiro = new int[11][11];

		boolean validacao = true; // flag
		int numeroNavios = sc.nextInt();

		for (int i = 0; i < numeroNavios; i++) {
			int direcao = sc.nextInt();
			int comprimento = sc.nextInt();
			int linha = sc.nextInt();
			int coluna = sc.nextInt();

			if (direcao == 0) {
				int ultimaColuna = coluna + comprimento - 1;

				if (ultimaColuna > 10) {
					validacao = false;
				} else {

					for (int c = coluna; c <= ultimaColuna; c++) {
						if (tabuleiro[linha][c] == 1) {
							validacao = false;
							break;
						} else {
							tabuleiro[linha][c] = 1;
						}
					}
				}

			} else if (direcao == 1) {
				int ultimaLinha = linha + comprimento - 1;

				if (ultimaLinha > 10) {
					validacao = false;
				} else {
					for (int l = linha; l <= ultimaLinha; l++) {
						if (tabuleiro[l][coluna] == 1) {
							validacao = false;
							break;
						} else {
							tabuleiro[l][coluna] = 1;
						}
					}
				}
			}

		}

		if (validacao) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}

		sc.close();

	}

}
