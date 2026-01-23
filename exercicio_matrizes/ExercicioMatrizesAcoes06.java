import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatrizesAcoes06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double [] [] mat = new double [n] [n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat [i] [j] = sc.nextDouble();
			}
		}
		
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		
		//Soma dos elementos positivos da matriz
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat [i] [j] > 0) {
					soma = soma + mat [i] [j];
				}
			}
		}
		System.out.println("SOMA DOS POSITIVOS: " + soma);
		
		
		//Elementos da linha escolhida
		System.out.println("LINHA ESCOLHIDA: ");
		for (int j = 0; j < n; j++) {
			System.out.printf("%.1f ", mat [linha] [j]);
		}
		System.out.println();
		
		
		//Elemento da coluna escolhida
		System.out.println("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat [i] [coluna]);
		}
		System.out.println();
		
		
		//elementos da matriz principal
		System.out.println("MATRIZ PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat [i] [i]);
		}
		System.out.println();
		
		
		//elevando ao quadrado os elementos da matriz que são negativos
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat [i] [j] < 0.0) {
					mat [i] [j] = mat [i] [j] * mat [i] [j];
				}
			}
		}
		System.out.println("MATRIZ ALTERADA: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%.1f ", mat[i] [j]);
			}
			System.out.println();
		}
		
		
		sc.close();

	}

}
