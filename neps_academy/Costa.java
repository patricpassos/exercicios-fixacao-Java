import java.util.Scanner;

public class Costa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		char[][] mat = new char[m][n];
		int cont = 0;

		for (int i = 0; i < m; i++) {
			String linha = sc.next(); //leitura da linha inteira colada sem expaços ex: "..##.."
			for (int j = 0; j < n; j++) {
				mat[i][j] = linha.charAt(j);
			}
		}

		for (int a = 0; a < m; a++) {
			for (int b = 0; b < n; b++) {

				boolean t = false;

				if (mat[a][b] == '#') {

					if (a == 0 || mat[a - 1][b] == '.') { //teste em cima
						t = true;
					} else if (a == m - 1 || mat[a + 1][b] == '.') { //teste em baixo
						t = true;
					} else if (b == 0 || mat[a][b - 1] == '.') { // teste esquerda
						t = true;
					} else if (b == n - 1 || mat[a][b + 1] == '.') { // teste direita
						t = true;
					}

					if (t) {
						cont++;
					}
				}

			}
		}

		System.out.println(cont);

		sc.close();

	}

}
