
import java.util.Scanner;
import java.util.stream.IntStream;

public class SomaDiagonaisMatrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int somaDigonalPrincipal = 0;
		for(int i = 0; i < mat.length; i++) {
			somaDigonalPrincipal += mat[i][i];
		}
		
		int somaDiagonalSecundaria = 0;
		for(int i = 0; i < mat.length; i++) {
			somaDiagonalSecundaria += mat[i][(mat.length - 1) - i];
		}
		
		System.out.println("Diagonal principal: " + somaDigonalPrincipal);
		System.out.println("Diagonal secundaria: " + somaDiagonalSecundaria);
		
		
		int somaDiagoPrincipal = IntStream.range(0, mat.length).map(i -> mat[i][i]).sum();
		System.out.println("Soma diagonal principal: " + somaDiagoPrincipal);
		
		int somaDiagoSecundaria = IntStream.range(0, mat.length).map(i -> mat[i][(mat.length - 1) - i]).sum();
		System.out.println("Soma diagonal secundaria: " + somaDiagoSecundaria);
	
		sc.close();

	}

}
