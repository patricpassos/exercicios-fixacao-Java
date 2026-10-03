import java.util.Scanner;


public class QuadradoMagicoMatrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		boolean sinal = true;
		
		int somaDiagonalPrincipal = 0;
		for (int i = 0; i < mat.length; i++) {
			somaDiagonalPrincipal += mat[i][i];
		}

		int somaDiagonalSecundaria = 0;
		for (int i = 0; i < mat.length; i++) {
			somaDiagonalSecundaria += mat[i][(mat.length - 1) - i];
		}
		
		for (int i = 0; i < mat.length; i++) {
			int somaLinha = 0;
			int somaColuna = 0;
			for (int j = 0; j < mat.length; j++) {
				somaLinha += mat[i][j];
				somaColuna += mat[j][i];
			}
			
			sinal = (somaLinha == somaColuna && somaLinha == somaDiagonalPrincipal && somaLinha == somaDiagonalSecundaria);
			
			if(!sinal) {
				break;
			}
			
		}
		
		String resultado  = (!sinal) ? "NAO": "SIM";
		System.out.println(resultado);

		sc.close();

	}

}
